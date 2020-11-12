package com.common.mvvm.ob

import androidx.fragment.app.FragmentActivity
import androidx.lifecycle.Observer
import com.common.mvvm.livedata.ActivityLiveData

/**
 * Created by hzz on 2018/8/18.
 */
class DefaultActivityObserver(val owner: FragmentActivity) : Observer<ActivityLiveData.Result> {

    override fun onChanged(it: ActivityLiveData.Result?) {
        it?.let {
            when (it.cmd) {
                ActivityLiveData.CMD_FINISH -> {
                    owner.finish()
                }
                ActivityLiveData.CMD_FINISH_RESULT -> {
                    owner.setResult(it.resultCode, it.data)
                    owner.finish()
                }
            }
        }
    }

}