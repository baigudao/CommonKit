package com.common.widget.recyclerview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;

import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

/**
 * @author: robert
 * @date: 2017-12-02
 * @time: 19:49
 * @说明:
 */
public class HomeScrollRecyclerView extends RecyclerView {
    public HomeScrollRecyclerView(Context context) {
        super(context);
    }

    public HomeScrollRecyclerView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public HomeScrollRecyclerView(Context context, @Nullable AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    public boolean onTouchEvent(MotionEvent e) {
        e.setAction(MotionEvent.ACTION_CANCEL);
        return super.onTouchEvent(e);
    }
}
