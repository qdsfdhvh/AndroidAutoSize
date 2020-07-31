package com.seiko.autosize.sample

import android.app.Application
import com.seiko.autosize.AutoSizeConfig
import timber.log.Timber

class App : Application() {
    override fun onCreate() {
        super.onCreate()
        // Log
        if (BuildConfig.DEBUG) {
            Timber.plant(Timber.DebugTree())
        }
        // 屏幕自适应
        val autoAdaptStrategyFactory = AutoAdaptStrategyFactory.get()
        AutoSizeConfig.init(this, autoAdaptStrategyFactory.create())
    }
}