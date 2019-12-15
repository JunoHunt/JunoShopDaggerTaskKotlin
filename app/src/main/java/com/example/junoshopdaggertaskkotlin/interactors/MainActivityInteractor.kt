package com.example.junoshopdaggertaskkotlin.interactors

import com.example.junoshopdaggertaskkotlin.classes.Shop
import com.example.junoshopdaggertaskkotlin.repositories.IShopsRepository

class MainActivityInteractor(
    private val shopsRepository: IShopsRepository
) : IMainActivityInteractor {
    override fun getShops(): List<Shop> =
        shopsRepository.getShopsFromBase().plus(shopsRepository.getShopsFromWeb())
}