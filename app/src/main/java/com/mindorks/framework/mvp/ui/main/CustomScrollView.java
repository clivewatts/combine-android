package com.mindorks.framework.mvp.ui.main;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.ScrollView;

/**
 * Created by clivewatts on 2017/11/01.
 */

public class CustomScrollView extends ScrollView {

    boolean stopScroll;

    public CustomScrollView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    // true if we can scroll the ScrollView
    // false if we cannot scroll
    private boolean scrollable = true;

    public void setScrollingEnabled(boolean scrollable) {
        if (this.scrollable != scrollable)
            this.scrollable = scrollable;
    }

    public boolean isScrollable() {
        return scrollable;
    }

    @Override
    public boolean onTouchEvent(MotionEvent ev) {
        switch (ev.getAction()) {
            case MotionEvent.ACTION_DOWN:
                // if we can scroll pass the event to the superclass
                if (scrollable) return super.onTouchEvent(ev);
                // only continue to handle the touch event if scrolling enabled
                return scrollable; // scrollable is always false at this point
            default:
                return super.onTouchEvent(ev);
        }
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        // Don't do anything with intercepted touch events if
        // we are not scrollable
        if (!scrollable) return false;
        else return super.onInterceptTouchEvent(ev);
    }
}
