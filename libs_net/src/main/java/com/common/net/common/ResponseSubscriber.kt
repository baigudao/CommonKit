package com.common.net.common

import io.reactivex.Observer
import io.reactivex.disposables.Disposable

/**
 * @atuthor ydm
 * @data on 2018/8/7
 * @describe
 */
class ResponseSubscriber<T>(
    /* 回调 */
    private val responseListener: ResponseListener<T>
) : Observer<T> {
    /* Disposable */
    private var disposable: Disposable? = null


    override fun onSubscribe(d: Disposable) {
        disposable = d
    }

    override fun onNext(t: T) {
        responseListener.onSucceed(t)
    }

    override fun onComplete() {
        //回调
        responseListener.onComplete()
    }

    override fun onError(e: Throwable) {
        // 回调失败
        responseListener.onError(e)
    }

}