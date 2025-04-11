package com.example.midasoft.api.services

import com.example.midasoft.models.Usuario
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

interface UsuarioService {
    @GET("/usuarios")
    fun obtenerUsuarios(): Call<List<Usuario>>

    @POST("/usuarios")
    fun crearUsuario(@Body usuario: Usuario): Call<Usuario>
}
