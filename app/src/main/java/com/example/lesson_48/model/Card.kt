package com.example.lesson_48.model

import android.graphics.drawable.Drawable

class Card {
    var mainText:List<String>?=null
    var img:List<Drawable>? = null
    var text:List<String>?=null

    constructor(mainText: List<String>?, img: List<Drawable>?, text: List<String>?) {
        this.mainText = mainText
        this.img = img
        this.text = text
    }
}