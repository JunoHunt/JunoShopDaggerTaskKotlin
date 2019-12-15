package com.example.junoshopdaggertaskkotlin.classes

class Shop(val name: String, val procuctsCount: Int){
    override fun toString(): String {
        return "$name with $procuctsCount products"
    }
}