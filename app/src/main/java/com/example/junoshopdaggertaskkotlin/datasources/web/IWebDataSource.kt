package com.example.junoshopdaggertaskkotlin.datasources.web

import com.example.junoshopdaggertaskkotlin.classes.Shop

interface IWebDataSource {
    fun getShops(): List<Shop>
}