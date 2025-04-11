package com.example.midasoft.controllers

import android.util.Log
import com.example.midasoft.models.Usuario
import com.example.midasoft.api.RetrofitMongo
import com.example.midasoft.api.services.UsuarioService
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class UsuarioController {
    private val usuarioService = RetrofitMongo.retrofitService.create(UsuarioService::class.java)

    fun obtenerUsuarios(onResult: (List<Usuario>?) -> Unit) {
        usuarioService.obtenerUsuarios().enqueue(object : Callback<List<Usuario>> {
            override fun onResponse(call: Call<List<Usuario>>, response: Response<List<Usuario>>) {
                if (response.isSuccessful) {
                    onResult(response.body())
                } else {
                    onResult(null)
                }
            }

            override fun onFailure(call: Call<List<Usuario>>, t: Throwable) {
                Log.e("UsuarioController", "Error: ${t.message}")
                onResult(null)
            }
        })
    }

    fun crearUsuario(usuario: Usuario, onResult: (Usuario?) -> Unit) {
        usuarioService.crearUsuario(usuario).enqueue(object : Callback<Usuario> {
            override fun onResponse(call: Call<Usuario>, response: Response<Usuario>) {
                onResult(response.body())
            }

            override fun onFailure(call: Call<Usuario>, t: Throwable) {
                Log.e("UsuarioController", "Error: ${t.message}")
                onResult(null)
            }
        })
    }
}