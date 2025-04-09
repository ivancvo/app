package com.example.myapplication.Api

import retrofit2.Call
import com.example.myapplication.Modulos.Venta
import retrofit2.http.GET

interface VentasApi {
    @GET("api/ventas")

    fun getVentas(): Call<DataResponse>
}
