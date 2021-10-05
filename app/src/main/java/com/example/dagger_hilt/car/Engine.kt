package com.example.dagger_hilt.car

import android.util.Log
import javax.inject.Inject

class Engine {
    @Inject
    constructor()
    fun getEngine(){
        Log.d("main","Engine stared..")
    }
}