package com.example.dagger_hilt.car

import android.util.Log
import javax.inject.Inject

class Car @Inject constructor(private val engine: Engine,private val wheels: Wheels) {
    fun getCar(){
        engine.getEngine()
        wheels.getWheels()
        Log.d("main","car is running")
    }
}