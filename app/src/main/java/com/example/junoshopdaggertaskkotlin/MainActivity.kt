package com.example.junoshopdaggertaskkotlin

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    /***
     * В больших проектах используются различные MV*(MVP, MVI, MVVM),
     * но большинстве все эти зависимости в этих архитектурах решаются с помощью даггера
     *
     * В этом проекте Activity взаимодействует с интерактором,
     * который в свою очередь берет данные из репозитория,
     * который берет данные из датасоурсов
     *
     * Ваша задача решить зависимости уже реализованной архитектуры с помошью даггера
     * получить список магазинов из IMainActivityInteractor и вывести их в act_main_result_tv
     * Задача будет считаться решенной, если вы раскоментируете строки, возможно добавите,
     * запустите приложение и увидите на экране список магазинов
     */

//    @Inject
//    lateinit var mainInteractor: IMainActivityInteractor

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        act_main_result_tv.text = mainInteractor.getShops().toString()
    }
}
