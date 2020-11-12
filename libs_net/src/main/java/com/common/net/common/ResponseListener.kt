package com.common.net.common

/**
 * @author yedanmin
 * @data 2018/1/12 10:08
 * @describe
 */
interface ResponseListener<T>{
    /**
     * 成功后回调方法
     * @param data
     */
    fun onSucceed(data: T)

    /**
     * 失败
     * 失败或者错误方法
     * 自定义异常处理
     * @param exception
     */
    fun onError(exception: Throwable)

    /**
     * 观察者结束,不管 错误与否，都会被调用
     */
    fun onComplete()
}