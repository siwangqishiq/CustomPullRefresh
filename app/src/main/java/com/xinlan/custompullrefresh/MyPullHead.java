package com.xinlan.custompullrefresh;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.TextView;

import ptr.PtrFrameLayout;
import ptr.PtrUIHandler;
import ptr.indicator.PtrIndicator;

/**
 * Created by Administrator on 2015/9/25.
 */
public class MyPullHead extends TextView implements PtrUIHandler {

    public MyPullHead(Context context) {
        super(context);
    }

    public MyPullHead(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MyPullHead(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public MyPullHead(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    @Override
    public void onUIReset(PtrFrameLayout frame) {
        setText("onUIReset");
    }

    @Override
    public void onUIRefreshPrepare(PtrFrameLayout frame) {
        setText("onUIRefreshPrepare");
    }

    @Override
    public void onUIRefreshBegin(PtrFrameLayout frame) {
        setText("onUIRefreshBegin");
    }

    @Override
    public void onUIRefreshComplete(PtrFrameLayout frame) {
        setText("onUIRefreshComplete");
    }

    @Override
    public void onUIPositionChange(PtrFrameLayout frame, boolean isUnderTouch, byte status, PtrIndicator ptrIndicator) {
        //setText("onUIPositionChange");

    }
}//end class
