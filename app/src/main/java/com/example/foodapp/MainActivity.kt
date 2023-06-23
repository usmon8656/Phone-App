package com.example.foodapp

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import com.example.foodapp.databinding.ActivityMainBinding


class MainActivity : ComponentActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        setTheme(androidx.appcompat.R.style.Theme_AppCompat)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.btnMenu.setOnClickListener {
            startActivity(Intent(this, ListFoodActivity::class.java))
        }
        binding.btnFoodAdd.setOnClickListener {
            startActivity(Intent(this, AddFoodActivity::class.java))
        }
    }
}