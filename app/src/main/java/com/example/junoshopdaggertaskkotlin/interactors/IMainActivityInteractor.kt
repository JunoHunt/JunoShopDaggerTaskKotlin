package com.example.junoshopdaggertaskkotlin.interactors

import com.example.junoshopdaggertaskkotlin.classes.Shop

interface IMainActivityInteractor {
    fun getShops():List<Shop>
}