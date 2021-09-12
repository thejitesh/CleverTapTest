package com.clevertaptest.clevertapandroid

import com.clevertap.android.sdk.ActivityLifecycleCallback
import com.clevertaptest.clevertapandroid.analytics.AnalyticsEngine

class MyApplication: com.clevertap.android.sdk.Application(){

    override fun onCreate() {
        ActivityLifecycleCallback.register(this)
        super.onCreate()
        AnalyticsEngine.init(this)
    }

}
