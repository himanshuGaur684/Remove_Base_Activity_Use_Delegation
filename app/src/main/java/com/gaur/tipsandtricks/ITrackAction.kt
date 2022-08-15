package com.gaur.tipsandtricks

import android.util.Log

interface ITrackAction {

    fun trackAction(str:String)

}


class TrackActionImpl : ITrackAction{
    override fun trackAction(str: String) {
        Log.d("TAG", "trackAction: ")
    }
}