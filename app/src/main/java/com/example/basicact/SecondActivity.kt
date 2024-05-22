package com.example.basicact

import android.os.Bundle
import androidx.activity.ComponentActivity


class Activity1 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.first_activity)
    }
}