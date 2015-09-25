package com.xinlan.custompullrefresh;

import android.content.Context;
import android.util.AttributeSet;

import ptr.PtrFrameLayout;

/**
 * Created by Administrator on 2015/9/25.
 */
public class MyPullView extends PtrFrameLayout {
    private MyPullHead mHead;

    public MyPullView(Context context) {
        super(context);
        initViews();
    }

    public MyPullView(Context context, AttributeSet attrs) {
        super(context, attrs);
        initViews();
    }

    public MyPullView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        initViews();
    }

    private void initViews() {
        mHead = new MyPullHead(getContext());
        setHeaderView(mHead);
        addPtrUIHandler(mHead);
    }

    public MyPullHead getHeader() {
        return mHead;
    }
}//end class
