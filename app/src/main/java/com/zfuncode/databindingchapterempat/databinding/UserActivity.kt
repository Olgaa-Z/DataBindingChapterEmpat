package com.zfuncode.databindingchapterempat.databinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.zfuncode.databindingchapterempat.R

class UserActivity : AppCompatActivity() {

    lateinit var binding : ActivityUserBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_user)

//        binding.tvFirstName.text = "Zelvi"
//        binding.tvLastName.text = "Olga"

        binding.user = User("zelvi", "maharani")
        binding.handler = EventHandler(this)
    }
}