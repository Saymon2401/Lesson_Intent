package com.example.lesson_48.model

import java.io.Serializable

class User : Serializable {
    var username:String? = null
    var password:Int? = null

    constructor(username: String?, password: Int?) {
        this.username = username
        this.password = password
    }
}