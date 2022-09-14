package com.zfuncode.databindingchapterempat.databinding

import android.content.Context
import android.content.Intent
import com.zfuncode.databindingchapterempat.MainActivity
import com.zfuncode.databindingchapterempat.dbrecyclerview.DetailContact

class EventHandler(var context : Context) {

    fun onPindah(){
        context.startActivity(Intent(context, MainActivity::class.java))
    }

    fun onDetailContact(){
        context.startActivity(Intent(context, DetailContact::class.java))
    }
}