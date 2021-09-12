package com.clevertaptest.clevertapandroid

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.clevertaptest.clevertapandroid.analytics.AnalyticsEngine
import com.clevertaptest.clevertapandroid.analytics.AnalyticsEvent
import com.clevertaptest.clevertapandroid.analytics.AnalyticsEventAttribute
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        activity_main_product_viewed.setOnClickListener {

            val eventAttribute = AnalyticsEventAttribute(
                "1", "CleverTap",
                "https://d35fo82fjcw0y8.cloudfront.net/2018/07/26020307/customer-success-clevertap.jpg"
            )
            val event = AnalyticsEvent("Product Viewed", eventAttribute)
            AnalyticsEngine.track(event)
        }
    }
}
