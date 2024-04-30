package com.example.lesson_48.Third

import android.content.Intent
import android.os.Bundle
import android.provider.BlockedNumberContract.BlockedNumbers
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.lesson_48.R
import com.example.lesson_48.databinding.ActivityThirdFirstBinding
import com.example.lesson_48.model.Contact

class ThirdFirst : AppCompatActivity() {
    lateinit var binding: ActivityThirdFirstBinding
    var numbers = mutableListOf<Int>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityThirdFirstBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.next.setOnClickListener {
            var name = binding.name.text.toString()
            var num1 = (binding.number1.text.toString()).toInt()
            var num2 = (binding.number2.text.toString()).toInt()
            numbers.add(num1)
            numbers.add(num2)
            val bundle = Bundle()
            val contact = Contact(name,numbers)
            bundle.putSerializable("Contact",contact)
            val intent = Intent(this,ThirdSecond::class.java)
            intent.putExtras(bundle)
            startActivity(intent)
        }
    }
}