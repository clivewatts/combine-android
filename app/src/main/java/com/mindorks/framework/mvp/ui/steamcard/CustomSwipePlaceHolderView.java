package com.mindorks.framework.mvp.ui.steamcard;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

import com.mindorks.framework.mvp.ui.main.CustomScrollView;
import com.mindorks.placeholderview.SwipePlaceHolderView;

/**
 * Created by clivewatts on 2017/11/01.
 */

public class CustomSwipePlaceHolderView extends SwipePlaceHolderView {

    CustomScrollView scrollView;

    public CustomSwipePlaceHolderView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        return super.onTouchEvent(event);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        scrollView.setScrollingEnabled(false);
        if (ev.getAction() == MotionEvent.ACTION_UP) {
            scrollView.setScrollingEnabled(true);
        } else {
            scrollView.fullScroll(View.FOCUS_UP);
        }
        return super.onInterceptTouchEvent(ev);
    }

    public void setScrollView(CustomScrollView scrollView) {
        this.scrollView = scrollView;
    }

}
