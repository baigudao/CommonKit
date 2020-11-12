package com.common.mvvm.ob

import androidx.fragment.app.FragmentActivity
import androidx.lifecycle.Observer
import com.common.mvvm.livedata.ToastLiveData
import com.common.widget.ex.IToast
import com.common.widget.ex.toast

/**
 * Created by hzz on 2018/8/18.
 */
class DefaultToastObserver(val owner: FragmentActivity) : Observer<ToastLiveData.Toast> {

    override fun onChanged(it: ToastLiveData.Toast?) {
        owner.toast(it?.message ?: "", it?.type ?: IToast.NORMAL)
    }

}