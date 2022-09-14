package com.zfuncode.databindingchapterempat

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.zfuncode.databindingchapterempat.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.tvUbah.setOnClickListener {
            binding.tvHello.text = "Selamat Datang"
        }

        binding.btnFrament.setOnClickListener{
            supportFragmentManager.beginTransaction().
            replace(R.id.frag_container , BlankFragment())
                .commit()
        }

    }
}