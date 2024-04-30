package com.example.lesson_48.Lessons

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.lesson_48.R
import com.example.lesson_48.databinding.ActivityMain2Binding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.next.setOnClickListener {
            val intent = Intent(this,SecondActivity2::class.java)
            startActivityForResult(intent,1)
            // Сайт
//            val intent2 = Intent(Intent.ACTION_VIEW, Uri.parse("http://facebook.com"))
////            startActivity(intent2)

            // geo
//            val intent2 = Intent(Intent.ACTION_VIEW, Uri.parse("geo:41.0,64.0"))
//            startActivity(intent2)

            // telefon
//            val intent2 = Intent(Intent.ACTION_VIEW, Uri.parse("tel:123456"))
//            startActivity(intent2)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (data!=null){
            val name = data.getStringExtra("name")
            binding.user.text = "$name"
        }
    }
}