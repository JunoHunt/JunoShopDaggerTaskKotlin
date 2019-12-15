package com.example.junoshopdaggertaskkotlin.repositories

import com.example.junoshopdaggertaskkotlin.classes.Shop
import com.example.junoshopdaggertaskkotlin.datasources.bd.IBdDataSource
import com.example.junoshopdaggertaskkotlin.datasources.web.IWebDataSource

class ShopsRepository(
    private val bdDataSource: IBdDataSource,
    private val webDataSource: IWebDataSource
) : IShopsRepository {
    override fun getShopsFromWeb(): List<Shop> =
        webDataSource.getShops()

    override fun getShopsFromBase(): List<Shop> =
        bdDataSource.getShops()
}