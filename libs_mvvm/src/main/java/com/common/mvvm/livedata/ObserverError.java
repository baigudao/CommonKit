package com.common.mvvm.livedata;


import com.common.mvvm.livedata.ErrorLiveData.Error;

import org.jetbrains.annotations.NotNull;
/**
 * Created by hzz on 2018/8/19.
 */
public interface ObserverError {
    Boolean onChangedNeedIntercept(@NotNull Error error);
}
