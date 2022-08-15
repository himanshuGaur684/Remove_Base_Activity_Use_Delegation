package com.gaur.tipsandtricks

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() , IHardware by HardWareImpl() , ITrackAction by TrackActionImpl() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // monitor hardware changes
        observeBatteryChanges()
        observeNetworkChanges()


        // user is login
        // we need to track all of its action
        trackAction("fklajdklfakl")


    }
}