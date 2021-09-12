package com.clevertaptest.clevertapandroid.analytics

import android.content.Context
import com.clevertap.android.sdk.CleverTapAPI


object AnalyticsEngine {

    private var clevertapDefaultInstance: CleverTapAPI? = null

    fun init(context: Context) {
        clevertapDefaultInstance = CleverTapAPI.getDefaultInstance(context)
    }

    fun track(analyticsEvent: AnalyticsEvent) {
        val map = mutableMapOf<String, Any>()
        map["id"] = analyticsEvent.attributeAnalytics?.id.toString()
        map["name"] = analyticsEvent.attributeAnalytics?.name.toString()
        map["image"] = analyticsEvent.attributeAnalytics?.image.toString()
        clevertapDefaultInstance?.pushEvent(analyticsEvent.name, map)
    }
}