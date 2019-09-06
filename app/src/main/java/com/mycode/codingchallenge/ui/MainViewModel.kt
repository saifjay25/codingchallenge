package com.mycode.codingchallenge.ui

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.google.gson.Gson
import com.mycode.codingchallenge.entities.BasketballData
import java.io.BufferedReader
import java.io.InputStream
import java.io.InputStreamReader

class MainViewModel(application: Application) : AndroidViewModel(application) {

    var app :Application = application

    fun getData() : BasketballData{
        val input: InputStream = app.assets.open("basketballData.json")
        val rd = BufferedReader(InputStreamReader(input))
        val gson = Gson()
        return gson.fromJson(rd, BasketballData::class.java)
    }
}