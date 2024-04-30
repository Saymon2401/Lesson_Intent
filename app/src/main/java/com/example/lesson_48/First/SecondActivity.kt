package com.example.lesson_48.First

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.lesson_48.databinding.ActivityMainBinding
import com.example.lesson_48.databinding.ActivitySecondBinding
import com.example.lesson_48.model.User

class SecondActivity : AppCompatActivity() {
    lateinit var binding: ActivitySecondBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //Intent
//        var username = intent.getStringExtra("user")
//        var password = intent.getStringExtra("pass")
//        binding.tv.text = "$username $password"

        //Bundle
//        val extrass = intent.extras
//        val username = extrass?.getString("user")
//        val password = extrass?.getString("pass")
//        binding.tv.text = "$username $password"

        //Serializable
        val extras = intent.extras
        val user = extras?.getSerializable("user") as User
        binding.tv.text = "${user.username} ${user.password}"

        binding.cancel.setOnClickListener {
            finish()
        }
    }
}