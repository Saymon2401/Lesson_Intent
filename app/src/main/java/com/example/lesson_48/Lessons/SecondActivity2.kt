package com.example.lesson_48.Lessons

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.lesson_48.R
import com.example.lesson_48.databinding.ActivitySecond2Binding

class SecondActivity2 : AppCompatActivity() {
    lateinit var binding: ActivitySecond2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecond2Binding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.button.setOnClickListener {
            val text = binding.edit1.text.toString()
            val intent = Intent()
            intent.putExtra("name",text)
            setResult(RESULT_OK,intent)
            finish()
        }
    }
}