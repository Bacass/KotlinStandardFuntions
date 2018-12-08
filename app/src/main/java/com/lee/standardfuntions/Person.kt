package com.lee.standardfuntions

data class Person(var name: String, var age: Int, var job: String) {
    fun printPersion() {
        "Test " + this.toString()
    }
}

fun String.println() = "Test " + println(this)

