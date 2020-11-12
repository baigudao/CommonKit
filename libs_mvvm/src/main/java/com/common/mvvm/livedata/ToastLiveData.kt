package com.common.mvvm.livedata

import com.common.mvvm.livedata.event.EventLiveData
import com.common.widget.ex.IToast


/**
 * Created by hzz on 2018/8/18.
 */
class ToastLiveData : EventLiveData<ToastLiveData.Toast>() {

    fun show(message: String, type: IToast = IToast.NORMAL) {
        postEvent(Toast(type, message))
    }

    class Toast(val type: IToast, val message: String)
}