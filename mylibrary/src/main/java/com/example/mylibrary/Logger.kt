package com.example.mylibrary

import android.support.multidex.BuildConfig
import android.util.Log

object Logger {
    fun d(key: String?, msg: String?) {
        if (BuildConfig.DEBUG) {
            Log.d(key, msg!!)
        }
    }

    fun e(key: String?, msg: String?) {
        if (BuildConfig.DEBUG) {
            Log.e(key, msg!!)
        }
    }
}

