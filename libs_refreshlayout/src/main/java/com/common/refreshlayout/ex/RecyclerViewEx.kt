package com.common.refreshlayout.ex

import android.content.Context
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager

/**
 * @author yedanmin
 * @data 2018/1/17 15:22
 * @describe RecyclerView LayoutManager 扩展方法
 */

/**
 * 初始化网格布局
 * @param context 上下文
 * @param orientation 布局方式 {@link #HORIZONTAL} or {@link #VERTICAL}
 */
public inline fun RecyclerView.setLinearLayoutManager(
    context: Context,
    orientation: Int = LinearLayoutManager.VERTICAL
) {
    val layoutManager = LinearLayoutManager(context)
    layoutManager.orientation = orientation
    this.layoutManager = layoutManager
}

/**
 * 初始化网格布局
 * @param context 上下文
 * @param span    每行的格数
 */
public inline fun RecyclerView.setStaggeredGridLayoutManager(context: Context, span: Int) {
    val layoutManager = StaggeredGridLayoutManager(span, StaggeredGridLayoutManager.VERTICAL)
    layoutManager.orientation = LinearLayoutManager.VERTICAL
    this.layoutManager = layoutManager
}
