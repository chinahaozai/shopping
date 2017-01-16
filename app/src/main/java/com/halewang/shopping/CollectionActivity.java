package com.halewang.shopping;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.listener.OnItemChildClickListener;
import com.halewang.shopping.adapter.CollectionListAdapter;
import com.halewang.shopping.model.bean.user.Collection;
import com.halewang.shopping.utils.PrefUtil;

import java.util.List;

import cn.bmob.v3.BmobQuery;
import cn.bmob.v3.exception.BmobException;
import cn.bmob.v3.listener.FindListener;
import cn.bmob.v3.listener.UpdateListener;

public class CollectionActivity extends AppCompatActivity {

    private static final String TAG = "CollectionActivity";
    private RecyclerView mRecyclerView;
    private Toolbar mToolbar;

    private static final String IGNORE = "ignore";
    private CollectionListAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_collection);

        initView();
        initToolBar();
        initRecyclerView();
        initData();
    }

    private void initView() {
        mToolbar = (Toolbar) findViewById(R.id.toolbar);
        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerview);
    }

    private void initToolBar() {
        mToolbar.setTitle("我的收藏");
        setSupportActionBar(mToolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        mToolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
    }

    private void initRecyclerView() {
        mRecyclerView.setItemAnimator(new DefaultItemAnimator());
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mRecyclerView.addOnItemTouchListener(new OnItemChildClickListener() {
            @Override
            public void onSimpleItemChildClick(BaseQuickAdapter adapter, View view, int position) {
                Collection collection = (Collection) adapter.getItem(position);
                switch (view.getId()) {
                    case R.id.tv_title:
                    case R.id.image_collection:
                        Intent intent = new Intent(CollectionActivity.this, ProductDetailActivity2.class);
                        Bundle bundle = new Bundle();
                        bundle.putString(ProductDetailActivity2.SHOW_URL, collection.getShow_url());
                        bundle.putString(ProductDetailActivity2.TITLE, collection.getShow_title());
                        bundle.putString(ProductDetailActivity2.BUY_URL, collection.getBuy_url());
                        bundle.putString(ProductDetailActivity2.IMAGE_URL, collection.getImage_url());
                        intent.putExtra("detail", bundle);
                        startActivity(intent);
                        break;
                    case R.id.btn_delete:
                        doDelete(collection.getObjectId(), position);
                        break;
                    default:
                        break;
                }
            }
        });
    }

    private void initData() {
        BmobQuery<Collection> userQuery = new BmobQuery<>();
        userQuery.addWhereEqualTo("phone", PrefUtil.getString(this, LoginActivity.PHONE, ""));
        userQuery.findObjects(new FindListener<Collection>() {
            @Override
            public void done(List<Collection> list, BmobException e) {
                if (list.size() > 0) {
                    mAdapter = new CollectionListAdapter(list);
                    mAdapter.openLoadAnimation(BaseQuickAdapter.SLIDEIN_BOTTOM);
                    mRecyclerView.setAdapter(mAdapter);
                } else {
                    Log.d(TAG, "done: 加载我的收藏数据失败或者数据为0条");
                }
            }
        });
    }

    private void doDelete(final String objectId, final int position) {
        if (!PrefUtil.getBoolean(CollectionActivity.this, IGNORE, false)) {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            final AlertDialog dialog = builder.create();
            View view = getLayoutInflater().inflate(R.layout.dialog_delete_item, null);
            dialog.setView(view);
            Button btnCancel = (Button) view.findViewById(R.id.btn_cancel);
            btnCancel.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    dialog.dismiss();
                }
            });
            final CheckBox cbIgnore = (CheckBox) view.findViewById(R.id.cb_ignore);
            Button btnConfirm = (Button) view.findViewById(R.id.btn_confirm);
            btnConfirm.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if (cbIgnore.isChecked()) {
                        PrefUtil.putBoolean(CollectionActivity.this, IGNORE, true);
                    }
                    deleteItem(objectId);
                    dialog.dismiss();
                    mAdapter.remove(position);
                }
            });
            dialog.show();
        } else {
            deleteItem(objectId);
            mAdapter.remove(position);
        }
        //builder.show();
    }

    private void deleteItem(String objectId) {
        Collection collection = new Collection();
        collection.setObjectId(objectId);
        collection.delete(new UpdateListener() {
            @Override
            public void done(BmobException e) {
                if (e != null) {
                    Toast.makeText(CollectionActivity.this, "删除失败", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
