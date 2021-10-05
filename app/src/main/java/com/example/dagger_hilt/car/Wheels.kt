package com.example.dagger_hilt.car

import android.util.Log
import javax.inject.Inject

class Wheels {

        @Inject
        constructor()
        fun getWheels(){
            Log.d("main","Wheels stared..")
        }
}