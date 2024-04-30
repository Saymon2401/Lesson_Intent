package com.example.lesson_48.Third

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.lesson_48.R
import com.example.lesson_48.databinding.ActivityThirdFirstBinding
import com.example.lesson_48.databinding.ActivityThirdSecondBinding
import com.example.lesson_48.model.Contact

class ThirdSecond : AppCompatActivity() {
    lateinit var binding: ActivityThirdSecondBinding
    val numbers = mutableListOf<String>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityThirdSecondBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val extras = intent.extras
        val contact = extras?.getSerializable("Contact") as Contact
        for (i in contact.numbers!!.indices){
            numbers.add("Number${i+1}->${contact.numbers!![i]} ")
        }
        binding.name.text = "${contact.name}"

        binding.numbers.text = numbers.toString()
        binding.close.setOnClickListener { finish() }
    }
}