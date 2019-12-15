package com.example.junoshopdaggertaskkotlin.repositories

import com.example.junoshopdaggertaskkotlin.classes.Shop

interface IShopsRepository {
    fun getShopsFromWeb(): List<Shop>
    fun getShopsFromBase(): List<Shop>
}