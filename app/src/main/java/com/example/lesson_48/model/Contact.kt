package com.example.lesson_48.model

import java.io.Serializable

class Contact : Serializable {
    var name:String? = null
    var numbers:List<Int>? = null

    constructor(name: String?, numbers: List<Int>?) {
        this.name = name
        this.numbers = numbers
    }
}