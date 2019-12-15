package com.example.junoshopdaggertaskkotlin.datasources.bd

import com.example.junoshopdaggertaskkotlin.classes.Shop

interface IBdDataSource {
    fun getShops(): List<Shop>
}