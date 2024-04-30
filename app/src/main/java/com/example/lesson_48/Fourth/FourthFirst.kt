package com.example.lesson_48.Fourth

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.lesson_48.R
import com.example.lesson_48.databinding.ActivityFourthFirstBinding
import com.example.lesson_48.databinding.ActivityThirdSecondBinding

class FourthFirst : AppCompatActivity() {
    lateinit var binding: ActivityFourthFirstBinding
    var cards = listOf<ConstraintLayout>()
    var cardInd:Int? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFourthFirstBinding.inflate(layoutInflater)
        setContentView(binding.root)
        cards = listOf(
            binding.card1,
            binding.card2,
            binding.card3,
            binding.card4,
            binding.card5
        )
        cards.forEachIndexed { index, card ->
            card.setOnClickListener {
                val intent = Intent(this,FourthSecond::class.java)
                intent.putExtra("cardIndex",index)
                startActivity(intent)
            }
        }
    }
}