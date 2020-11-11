package com.common.main

import android.content.Context
import android.widget.Toast

/**
 * Created by lhl on 2020/11/11.
 */
object Utils {

    fun takeToast(context: Context, str: String) {
        Toast.makeText(context, str, Toast.LENGTH_SHORT).show()
    }
}