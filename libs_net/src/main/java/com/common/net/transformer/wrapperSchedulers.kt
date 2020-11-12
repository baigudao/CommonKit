package com.common.net.transformer

import io.reactivex.Observable
import io.reactivex.ObservableSource
import io.reactivex.ObservableTransformer
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

/**
 * @author yedanmin
 * @data 2018/1/16 15:24
 * @describe 没有重试函数
 */
@Deprecated(message = "This class is no longer supported, do not use it.")
class wrapperSchedulers<T> : ObservableTransformer<T, T> {
    override fun apply(upstream: Observable<T>): ObservableSource<T> =
        upstream
            // .delay(5, TimeUnit.SECONDS)     //请求延迟五秒，再开始
            .subscribeOn(Schedulers.io())
            .unsubscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread(), true)
}