package com.mobile.happyegg

import android.app.Application
import com.mobile.happyegg.di.initKoin
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.logger.Level

class HappyEggMainApp: Application() {
    override fun onCreate() {
        super.onCreate()
        initKoin {
            androidContext(this@HappyEggMainApp)
            androidLogger(Level.DEBUG)
        }
    }
}