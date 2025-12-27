package com.example.privacytoggle

import android.content.Intent
import android.os.Bundle
import android.provider.Settings
import androidx.appcompat.app.AppCompatActivity
import com.example.privacytoggle.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnMicrophone.setOnClickListener {
            startActivity(Intent(Settings.ACTION_PRIVACY_SETTINGS))
        }

        binding.btnCamera.setOnClickListener {
            startActivity(Intent(Settings.ACTION_PRIVACY_SETTINGS))
        }

        binding.btnPrivacy.setOnClickListener {
            startActivity(Intent(Settings.ACTION_PRIVACY_DASHBOARD))
        }
    }
}
