package com.example.kmmapplication.shared


class Greeting {
    fun greeting(): String {
        return "Guess what is is! < , ${Platform().platform.reversed()}!"
    }
}
