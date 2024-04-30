package com.example.lesson_48.Second

import android.content.Intent
import android.graphics.drawable.BitmapDrawable
import android.os.Bundle
import android.util.Log
import android.widget.LinearLayout
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.core.content.ContextCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.lesson_48.R
import com.example.lesson_48.databinding.ActivitySecondMainExBinding
import com.example.lesson_48.databinding.ActivitySecondSecondExBinding
import java.lang.IndexOutOfBoundsException

class SecondSecondEx : AppCompatActivity() {
    lateinit var binding: ActivitySecondSecondExBinding
    lateinit var cards:List<CardView>
    var doubleCard = mutableListOf<Int>()
    var cardInd:Int? = null
    var lastIndex:Int? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondSecondExBinding.inflate(layoutInflater)
        setContentView(binding.root)
        cards = listOf(
            binding.card1,
            binding.card2,
            binding.card3,
            binding.card4,
            binding.card5,
            binding.card6
        )

        //change all line to white
        for (liner in cards) {
            liner.setCardBackgroundColor(ContextCompat.getColor(this,R.color.white))
        }
        //button card
        cards.forEachIndexed { index, card ->
            card.setOnClickListener {
                cardInd = index
                doubleCard.add(index)
                if (doubleCard.size==1){
                    card.setCardBackgroundColor(ContextCompat.getColor(this,R.color.red))
                }else{
                   card.setCardBackgroundColor(ContextCompat.getColor(this,R.color.red))
                   cards[lastIndex!!].setCardBackgroundColor(ContextCompat.getColor(this,R.color.white))
                }
                lastIndex = cardInd
            }
        }
        binding.btnNext.setOnClickListener {
            var colorNum = cardInd
            val intent = Intent()
            intent.putExtra("color",colorNum)
            setResult(RESULT_OK,intent)
            finish()
        }
    }
}