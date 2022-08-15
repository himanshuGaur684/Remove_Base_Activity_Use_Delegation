package com.gaur.tipsandtricks

import android.util.Log
import kotlin.math.log


// follow single responsibility
interface IHardware {

    fun observeNetworkChanges()
    fun observeBatteryChanges()

}

class HardWareImpl: IHardware{
    override fun observeNetworkChanges() {
        Log.d("TAG", "observeNetworkChanges: ")
    }

    override fun observeBatteryChanges() {
        Log.d("TAG", "observeBatteryChanges: ")    }
}

