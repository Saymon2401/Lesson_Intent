package com.example.lesson_48.Second

import android.content.Intent
import android.graphics.drawable.Drawable
import android.media.session.PlaybackState.CustomAction
import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.lesson_48.R
import com.example.lesson_48.databinding.ActivitySecondMainExBinding

class SecondMainEx : AppCompatActivity() {
    lateinit var binding: ActivitySecondMainExBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondMainExBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnNext.setOnClickListener {

            var intent = Intent(this,SecondSecondEx::class.java)
            startActivityForResult(intent,1)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
            if (data!=null){
                val colorNum = data.getIntExtra("color",0)
                when(colorNum){
                    0 -> binding.main.setBackgroundDrawable(ContextCompat.getDrawable(this,R.drawable.gr1))
                    1 -> binding.main.setBackgroundDrawable(ContextCompat.getDrawable(this,R.drawable.gr2))
                    2 -> binding.main.setBackgroundDrawable(ContextCompat.getDrawable(this,R.drawable.gr3))
                    3 -> binding.main.setBackgroundDrawable(ContextCompat.getDrawable(this,R.drawable.gr4))
                    4 -> binding.main.setBackgroundDrawable(ContextCompat.getDrawable(this,R.drawable.gr5))
                    5 -> binding.main.setBackgroundDrawable(ContextCompat.getDrawable(this,R.drawable.gr6))
                }
            }
    }
}