package com.example.foodapp

import Catch.MySharedPreference
import Models.Food
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.foodapp.databinding.ActivityAddFoodBinding

class AddFoodActivity : AppCompatActivity() {
    private lateinit var binding: ActivityAddFoodBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityAddFoodBinding.inflate(layoutInflater)
        setTheme(androidx.appcompat.R.style.Theme_AppCompat)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        title = "Taom qo`shish"

        MySharedPreference.init(this )

        binding.btnSave.setOnClickListener {
            val name = binding.edtFoodName.text.toString()
            val product = binding.edtFoodProduct.text.toString()
            val preparationOrder = binding.edtPreparation.text.toString()

            if (name!="" && product!="" && preparationOrder!=""){
                val list = MySharedPreference.obyekString
                list.add(Food(name , product ,preparationOrder))
                MySharedPreference.obyekString = list
                Toast.makeText(this, "Save", Toast.LENGTH_SHORT).show()
                finish()
            }else{
                Toast.makeText(this, "Nalumot yetarli emas", Toast.LENGTH_SHORT).show()
            }
        }
    }
}