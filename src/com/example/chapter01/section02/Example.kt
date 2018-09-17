package com.example.chapter01.section02

data class User(val name: String, val age: Int)

var click: (() -> Unit)? = null

fun clickView() {
    click?.invoke()
}

fun User.isAdult(): Boolean {
    return age > 18
}


val user = User("Jack", 19)
val isAudlt = user.isAdult()

