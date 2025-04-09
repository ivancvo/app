package com.example.myapplication.Api

import retrofit2.Call
import retrofit2.http.GET

interface ApiServicesFlask {

    @GET("/")
    fun getProductos():Call<List<String>>
}
