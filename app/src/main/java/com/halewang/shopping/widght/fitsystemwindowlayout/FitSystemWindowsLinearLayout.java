package com.halewang.shopping.widght.fitsystemwindowlayout;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.LinearLayout;


/**
 * Created by zhuchenxi on 15/11/7.
 */
public class FitSystemWindowsLinearLayout extends LinearLayout {
    private static int STATUSBAR_HEIGHT;
    private static int NAVIGATIONBAR_HEIGHT;
    private int mScreenOrientation = VERTICAL;

    private boolean mPaddingStatusBar;
    private boolean mPaddingNavigationBar;
    private int mStatusBarColor = 0;
    private int mStatusBarHeight = 0;
    private int mNavigationBarHeight = 0;
    private Paint mStatusBarPaint;

    public FitSystemWindowsLinearLayout(Context context) {
        super(context);
        init();
    }

    public FitSystemWindowsLinearLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
        initAttrs(attrs);
        init();
    }

    public FitSystemWindowsLinearLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initAttrs(attrs);
        init();
    }
    protected void initAttrs(AttributeSet attrs) {
        TypedArray a = getContext().obtainStyledAttributes(attrs, com.jude.fitsystemwindowlayout.R.styleable.fit_system_windows);
        try {
            int colorAttr;
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                colorAttr = android.R.attr.colorPrimaryDark;
            } else {
                colorAttr = getContext().getResources().getIdentifier("colorPrimaryDark", "attr", getContext().getPackageName());
            }
            TypedValue outValue = new TypedValue();
            getContext().getTheme().resolveAttribute(colorAttr, outValue, true);

            if (outValue.resourceId!=0)mStatusBarColor = getResources().getColor(outValue.resourceId);
            mStatusBarColor = a.getColor(com.jude.fitsystemwindowlayout.R.styleable.fit_system_windows_status_color,mStatusBarColor);
            mPaddingStatusBar = a.getBoolean(com.jude.fitsystemwindowlayout.R.styleable.fit_system_windows_padding_status, true);
            mPaddingNavigationBar = a.getBoolean(com.jude.fitsystemwindowlayout.R.styleable.fit_system_windows_padding_navigation, false);
        } finally {
            a.recycle();
        }
    }

    private void init(){
        int statusBarHeight = 0;
        int navigationBarHeight = 0;
        setWillNotDraw(false);
        setFitsSystemWindows(true);
        mScreenOrientation = (getResources().getConfiguration().orientation== Configuration.ORIENTATION_PORTRAIT)?VERTICAL:HORIZONTAL;

        STATUSBAR_HEIGHT = Utils.getStatusBarHeight(getContext());
        NAVIGATIONBAR_HEIGHT = Utils.getNavigationBarHeight(getContext());
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT ){
            if (mPaddingStatusBar) statusBarHeight = STATUSBAR_HEIGHT;
            if (mPaddingNavigationBar&& Utils.hasSoftKeys(getContext())) navigationBarHeight = NAVIGATIONBAR_HEIGHT;
        }

        mStatusBarHeight = statusBarHeight;
        mNavigationBarHeight = navigationBarHeight;
        mStatusBarPaint = new Paint();
        mStatusBarPaint.setColor(mStatusBarColor);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (mPaddingStatusBar){
            canvas.drawRect(0,0,getRight(),mStatusBarHeight,mStatusBarPaint);
        }
    }

    public void setStatusBarColor(int color){
        mStatusBarColor = color;
        mStatusBarPaint.setColor(mStatusBarColor);
        invalidate();
    }


    @Override
    protected boolean fitSystemWindows(Rect insets) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            Utils.log("fitSystemWindows"
                    +"  Left:"+insets.left
                    +"  Top:"+insets.top
                    +"  Right:"+insets.right
                    +"  Bottom:"+insets.bottom);
            int bottom = insets.bottom;
            int right = insets.right;
            if(insets.bottom == NAVIGATIONBAR_HEIGHT)bottom = mNavigationBarHeight;
            if(insets.right == NAVIGATIONBAR_HEIGHT)right = mNavigationBarHeight;//横屏时才有padding_right
            insets.set(0, mStatusBarHeight, right, bottom);
        }
        return super.fitSystemWindows(insets);
    }

    @Override
    public final WindowInsets onApplyWindowInsets(WindowInsets insets) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            Utils.log("onApplyWindowInsets"
                    +"  Left:"+insets.getSystemWindowInsetLeft()
                    +"  Top:"+insets.getSystemWindowInsetTop()
                    +"  Right:"+insets.getSystemWindowInsetRight()
                    +"  Bottom:"+insets.getSystemWindowInsetBottom());

            int bottom = insets.getSystemWindowInsetBottom();
            int right = insets.getSystemWindowInsetRight();
            if(insets.getSystemWindowInsetBottom() == NAVIGATIONBAR_HEIGHT)bottom = mNavigationBarHeight;
            if(insets.getSystemWindowInsetRight() == NAVIGATIONBAR_HEIGHT)right = mNavigationBarHeight;//横屏时才有padding_right
            return super.onApplyWindowInsets(insets.replaceSystemWindowInsets(0, mStatusBarHeight, right, bottom));//还得靠爸爸来应用padding
        } else {
            return insets;
        }
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        for (int i = 0; i < getChildCount(); i++) {
            View child = getChildAt(i);
            LayoutParams lp = (LayoutParams) child.getLayoutParams();
            if (mScreenOrientation == VERTICAL&&lp.isPaddingNavigation()) Utils.paddingToNavigationBar(child);
        }
    }

    @Override
    public LayoutParams generateLayoutParams(AttributeSet attrs) {
        return new LayoutParams(getContext(), attrs);
    }

    @Override
    protected LayoutParams generateLayoutParams(ViewGroup.LayoutParams p) {
        if (p instanceof LayoutParams) {
            return new LayoutParams((LayoutParams) p);
        } else if (p instanceof MarginLayoutParams) {
            return new LayoutParams((MarginLayoutParams) p);
        }
        return new LayoutParams(p);
    }

    @Override
    protected LinearLayout.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
    }

    public static class LayoutParams extends LinearLayout.LayoutParams {
        private boolean mPaddingNavigation = false;


        public LayoutParams(Context context, AttributeSet attrs) {
            super(context, attrs);
            final TypedArray a = context.obtainStyledAttributes(attrs,
                    com.jude.fitsystemwindowlayout.R.styleable.fit_system_windows);
            this.mPaddingNavigation = a.getBoolean(
                    com.jude.fitsystemwindowlayout.R.styleable.fit_system_windows_padding_navigation,
                    false);
            a.recycle();
        }

        public LayoutParams(int width, int height) {
            super(width, height);
        }

        public LayoutParams(int width, int height, float weight) {
            super(width, height, weight);
        }

        public LayoutParams(ViewGroup.LayoutParams p) {
            super(p);
        }

        public LayoutParams(MarginLayoutParams source) {
            super(source);
        }

        public boolean isPaddingNavigation() {
            return mPaddingNavigation;
        }

        public void setPaddingNavigation(boolean mPaddingNavigation) {
            this.mPaddingNavigation = mPaddingNavigation;
        }
    }
}
