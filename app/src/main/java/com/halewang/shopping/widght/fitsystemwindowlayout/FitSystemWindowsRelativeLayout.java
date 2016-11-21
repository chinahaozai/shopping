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
import android.widget.RelativeLayout;

import com.jude.fitsystemwindowlayout.Utils;

/**
 * Created by zhuchenxi on 15/11/7.
 */
public class FitSystemWindowsRelativeLayout extends RelativeLayout {
    public static final int HORIZONTAL = 0;
    public static final int VERTICAL = 1;
    private static int STATUSBAR_HEIGHT;
    private static int NAVIGATIONBAR_HEIGHT;
    private int mScreenOrientation = VERTICAL;
    private boolean isInputMethod = false;
    private int mInputMethodHeight = 0;
    private boolean mPaddingStatusBar;
    private boolean mPaddingNavigationBar;
    private int mStatusBarColor = 0;
    private int mStatusBarHeight = 0;
    private int mNavigationBarHeight = 0;
    private Paint mStatusBarPaint;

    public FitSystemWindowsRelativeLayout(Context context) {
        super(context);
        init();
    }

    public FitSystemWindowsRelativeLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
        initAttrs(attrs);
        init();
    }

    public FitSystemWindowsRelativeLayout(Context context, AttributeSet attrs, int defStyleAttr) {
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
            com.jude.fitsystemwindowlayout.Utils.log("initAttrs"+" mStatusBarColor"+mStatusBarColor+"  mPaddingStatusBar:"+mPaddingStatusBar+"  mPaddingStatusBar:"+mPaddingStatusBar);
        } finally {
            a.recycle();
        }
    }

    private void init(){
        int statusBarHeight = 0;
        int navigationBarHeight = 0;
        setWillNotDraw(false);
        setFitsSystemWindows(false);//不然4.4就会绘制默认的statusBar遮罩
        mScreenOrientation = (getResources().getConfiguration().orientation== Configuration.ORIENTATION_PORTRAIT)?VERTICAL:HORIZONTAL;
        STATUSBAR_HEIGHT = com.jude.fitsystemwindowlayout.Utils.getStatusBarHeight(getContext());
        NAVIGATIONBAR_HEIGHT = com.jude.fitsystemwindowlayout.Utils.getNavigationBarHeight(getContext());
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT ){
            statusBarHeight = STATUSBAR_HEIGHT;
            if (com.jude.fitsystemwindowlayout.Utils.hasSoftKeys(getContext())) navigationBarHeight = NAVIGATIONBAR_HEIGHT;
        }
        mStatusBarHeight = statusBarHeight;
        mNavigationBarHeight = navigationBarHeight;
        mStatusBarPaint = new Paint();
        mStatusBarPaint.setColor(mStatusBarColor);
        com.jude.fitsystemwindowlayout.Utils.log("init"+"  mStatusBarHeight:"+mStatusBarHeight+"  mNavigationBarHeight:"+mNavigationBarHeight);
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
            com.jude.fitsystemwindowlayout.Utils.log("fitSystemWindows"
                    +"  Left:"+insets.left
                    +"  Top:"+insets.top
                    +"  Right:"+insets.right
                    +"  Bottom:"+insets.bottom);
            if(insets.bottom > NAVIGATIONBAR_HEIGHT){
                mInputMethodHeight = insets.bottom;
                isInputMethod = true;
            }else {
                mInputMethodHeight = 0;
                isInputMethod = false;
            }
            applyPadding();
            insets.set(0,0,0,0);
        }
        return super.fitSystemWindows(insets);
    }

    @Override
    public final WindowInsets onApplyWindowInsets(WindowInsets insets) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            com.jude.fitsystemwindowlayout.Utils.log("onApplyWindowInsets"
                    +"  Left:"+insets.getSystemWindowInsetLeft()
                    +"  Top:"+insets.getSystemWindowInsetTop()
                    +"  Right:"+insets.getSystemWindowInsetRight()
                    +"  Bottom:"+insets.getSystemWindowInsetBottom());

            if(insets.getSystemWindowInsetBottom() > NAVIGATIONBAR_HEIGHT){
                mInputMethodHeight = insets.getSystemWindowInsetBottom();
                isInputMethod = true;
            }else {
                mInputMethodHeight = 0;
                isInputMethod = false;
            }
            applyPadding();
            insets.replaceSystemWindowInsets(0,0,0,0);//使默认的padding效果失效，因为我完全自己处理了。
            return insets;//我重写了自己的Padding规则，所以我可以无视对insets的处理。
        } else {
            return insets;
        }
    }

    public void applyPadding(){
        for (int i = 0; i < getChildCount(); i++) {
            View child = getChildAt(i);
            LayoutParams lp = (LayoutParams) child.getLayoutParams();
            //可滑动View内Padding
            if (mScreenOrientation == VERTICAL&&lp.isPaddingNavigation())
                com.jude.fitsystemwindowlayout.Utils.paddingToNavigationBar(child);

            if (!lp.hasSetMarginStatus()&&!lp.isForceLayout()){
                lp.setMarginStatus(mPaddingStatusBar);
            }

            if (!lp.hasSetMarginNavigation()&&!lp.isForceLayout()){
                lp.setMarginNavigation(mPaddingNavigationBar);
            }

            //合适的marginStatus与marginNavigation
            lp.topMargin = getStatusValue(lp);

            lp.bottomMargin =  getNavigationVerticalValue(lp);
            lp.rightMargin  =  getNavigationHorizontalValue(lp);

            Utils.log(""+child.getClass().getSimpleName()+" "+lp.leftMargin+" - "+lp.topMargin+" - "+lp.rightMargin+" - "+lp.bottomMargin);
        }
    }

    //返回底部应有padding
    private int getNavigationVerticalValue(LayoutParams lp){
        if (isInputMethod)return mInputMethodHeight;
        return (mScreenOrientation == VERTICAL)?(lp.mMarginNavigation?mNavigationBarHeight:0):0;
    }
    //返回右边应有padding
    private int getNavigationHorizontalValue(LayoutParams lp){
        return (mScreenOrientation == HORIZONTAL)?(lp.mMarginNavigation?mNavigationBarHeight:0):0;
    }

    //返回顶部应有padding
    private int getStatusValue(LayoutParams lp){
        return (lp.mMarginStatus?mStatusBarHeight:0);
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
    protected RelativeLayout.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
    }

    public static class LayoutParams extends RelativeLayout.LayoutParams {
        private boolean mPaddingNavigation = false;
        private boolean mMarginStatus = false;
        private boolean mHasSetMarginStatus = false;
        private boolean mMarginNavigation = false;
        private boolean mHasSetMarginNavigation = false;

        private boolean mForceLayout = false;

        public LayoutParams(Context context, AttributeSet attrs) {
            super(context, attrs);
            final TypedArray a = context.obtainStyledAttributes(attrs,
                    com.jude.fitsystemwindowlayout.R.styleable.fit_system_windows);
            this.mPaddingNavigation = a.getBoolean(
                    com.jude.fitsystemwindowlayout.R.styleable.fit_system_windows_padding_navigation,
                    false);

            mHasSetMarginStatus = a.hasValue(com.jude.fitsystemwindowlayout.R.styleable.fit_system_windows_margin_status);
            mHasSetMarginNavigation = a.hasValue(com.jude.fitsystemwindowlayout.R.styleable.fit_system_windows_margin_navigation);
            this.mMarginStatus = a.getBoolean(
                    com.jude.fitsystemwindowlayout.R.styleable.fit_system_windows_margin_status,
                    false);
            this.mMarginNavigation = a.getBoolean(
                    com.jude.fitsystemwindowlayout.R.styleable.fit_system_windows_margin_navigation,
                    false);
            this.mPaddingNavigation = a.getBoolean(
                    com.jude.fitsystemwindowlayout.R.styleable.fit_system_windows_padding_navigation,
                    false);

            out:for (int i : getRules()) {
                switch (i){
                    case ABOVE:
                    case BELOW:
                    case ALIGN_BASELINE:
                    case ALIGN_BOTTOM:
                    case ALIGN_TOP:
                    case CENTER_IN_PARENT:
                    case CENTER_VERTICAL:
                        mForceLayout = true;
                        break out;
                }
            }
            a.recycle();
        }

        public LayoutParams(int width, int height) {
            super(width, height);
        }

        public LayoutParams(ViewGroup.LayoutParams p) {
            super(p);
        }

        public LayoutParams(MarginLayoutParams source) {
            super(source);
        }

        public boolean isForceLayout() {
            return mForceLayout;
        }

        public void setForceLayout(boolean mForceLayout) {
            this.mForceLayout = mForceLayout;
        }

        public boolean isPaddingNavigation() {
            return mPaddingNavigation;
        }

        public void setPaddingNavigation(boolean mPaddingNavigation) {
            this.mPaddingNavigation = mPaddingNavigation;
        }

        public boolean isMarginStatus() {
            return mMarginStatus;
        }

        public void setMarginStatus(boolean mMarginStatus) {
            mHasSetMarginStatus = true;
            this.mMarginStatus = mMarginStatus;
        }

        public boolean hasSetMarginStatus() {
            return mHasSetMarginStatus;
        }

        public boolean isMarginNavigation() {
            return mMarginNavigation;
        }

        public void setMarginNavigation(boolean mMarginNavigation) {
            mHasSetMarginNavigation = true;
            this.mMarginNavigation = mMarginNavigation;
        }

        public boolean hasSetMarginNavigation() {
            return mHasSetMarginNavigation;
        }
    }
}
