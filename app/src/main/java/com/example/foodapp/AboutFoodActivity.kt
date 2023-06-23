package com.example.foodapp

import Catch.MySharedPreference
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.foodapp.databinding.ActivityAboutFoodBinding

class AboutFoodActivity : AppCompatActivity() {
    private lateinit var binding: ActivityAboutFoodBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityAboutFoodBinding.inflate(layoutInflater)
        setTheme(androidx.appcompat.R.style.Theme_AppCompat)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        MySharedPreference.init(this)
        val list = MySharedPreference.obyekString
        val position = intent.getIntExtra("position" , 0)
        binding.txtName.text = list[position].name
        binding.txtFoodProduct.text = list[position].ingredient
        binding.txtPreparation.text = list[position].preparationOrder
    }
}