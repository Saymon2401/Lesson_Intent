package com.example.lesson_48.First

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.lesson_48.databinding.ActivityMainBinding
import com.example.lesson_48.model.User

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.next.setOnClickListener {
            var username1 = binding.user.text.toString()
            var password1 = binding.password.text.toString()
            var passwordInt = password1.toInt()

            //Intent
//            intent.putExtra("user", username1)
//            intent.putExtra("pass", password1)
            //Bundle
//            val bundle = Bundle()
//            bundle.putString("user",username1)
//            bundle.putString("pass",password1)
            //Serializable
            val bundle = Bundle()
            val user = User(username1,passwordInt)
            bundle.putSerializable("user",user)

            val intent = Intent("Second")
            intent.putExtras(bundle)
            startActivity(intent)
        }
    }
}