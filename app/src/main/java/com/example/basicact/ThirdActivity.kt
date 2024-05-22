package com.example.basicact

import android.os.Bundle
import androidx.activity.ComponentActivity

class Activity2 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.second_activity)
    }
}