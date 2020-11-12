package com.common.mvvm.vm

import android.arch.lifecycle.Observer
import android.support.v4.app.FragmentActivity
import com.common.mvvm.livedata.ErrorLiveData
import com.common.mvvm.livedata.ProgressLiveData
import com.common.mvvm.livedata.ToastLiveData

/**
 * Created by Hzz on 2018/8/29
 */
interface IObserverProvider {
    fun providerProgressObserver(owner: FragmentActivity): Observer<ProgressLiveData.Progress>?
    fun providerToastObserver(owner: FragmentActivity): Observer<ToastLiveData.Toast>?
    fun providerErrorObserver(owner: FragmentActivity): Observer<ErrorLiveData.Error>?
}