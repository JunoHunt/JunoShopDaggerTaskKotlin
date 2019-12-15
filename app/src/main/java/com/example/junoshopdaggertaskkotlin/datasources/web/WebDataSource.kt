package com.example.junoshopdaggertaskkotlin.datasources.web

import com.example.junoshopdaggertaskkotlin.classes.Shop

class WebDataSource : IWebDataSource {
    override fun getShops(): List<Shop> =
        listOf(
            Shop("Shop from web 1", 3),
            Shop("Shop from web 2", 4)
        )
}