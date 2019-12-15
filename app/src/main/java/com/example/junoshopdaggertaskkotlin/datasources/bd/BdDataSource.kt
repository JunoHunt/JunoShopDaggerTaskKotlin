package com.example.junoshopdaggertaskkotlin.datasources.bd

import com.example.junoshopdaggertaskkotlin.classes.Shop

class BdDataSource: IBdDataSource {
    override fun getShops(): List<Shop> =
        listOf(
            Shop("Shop from bd 1", 1),
            Shop("Shop from bd 2", 2)
        )
}