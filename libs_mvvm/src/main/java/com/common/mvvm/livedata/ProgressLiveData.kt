package com.common.mvvm.livedata

import com.common.mvvm.livedata.event.EventLiveData

/**
 * Created by hzz on 2018/8/18.
 */
class ProgressLiveData : EventLiveData<ProgressLiveData.Progress>() {

    fun show(message: String = "") {
        postEvent(Progress(true, message))
    }

    fun hide() {
        postEvent(Progress(false))
    }

    class Progress(val show: Boolean, val message: String = "",val cancelable:Boolean = false)
}