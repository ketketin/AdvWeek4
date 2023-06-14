package com.katheryn.advweek4.view

import android.view.View
import androidx.navigation.Navigation

interface ButtonDetailClickListener {
    fun onButtonDetailClick(v:View)
}

interface ButtonUpdateClickListener {
    fun onButtonUpdateClick(v: View)
}

interface ButtonNotificationClickListener {
    fun onButtonNotificationClick(v: View)
}