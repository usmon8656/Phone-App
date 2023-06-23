package com.example.foodapp

import Adapter.MyAdapter
import Catch.MySharedPreference
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.foodapp.databinding.ActivityListFoodBinding

class ListFoodActivity : AppCompatActivity() {
    lateinit var myAdapter: MyAdapter
    private lateinit var binding: ActivityListFoodBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityListFoodBinding.inflate(layoutInflater)
        setTheme(androidx.appcompat.R.style.Theme_AppCompat)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        setTheme(androidx.appcompat.R.style.Theme_AppCompat)

        MySharedPreference.init(this)
        val list = MySharedPreference.obyekString

        myAdapter = MyAdapter(this, list)
        binding.listFood.adapter = myAdapter
        
        binding.listFood.setOnItemClickListener { parent, view, position, id ->
            val intent = Intent(this, AboutFoodActivity::class.java)
            intent.putExtra("position" , position)
            startActivity(intent)
        }

    }
}