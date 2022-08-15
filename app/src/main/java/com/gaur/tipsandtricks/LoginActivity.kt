package com.gaur.tipsandtricks

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class LoginActivity : AppCompatActivity(), IHardware by HardWareImpl() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        // monitor hardware changes
        observeNetworkChanges()
        observeBatteryChanges()

    }
}