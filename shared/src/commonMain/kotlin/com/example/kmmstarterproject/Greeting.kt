package com.example.kmmstarterproject

class Greeting {
    fun greeting(): String {
        return "Hello, ${Platform().platform}!"
    }
}