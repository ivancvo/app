package com.example.bya.controladores

import com.example.bya.modelos.usuarios.Usuario
import com.example.bya.modelos.usuarios.Rol

class UsuarioController {
    private val listaUsuarios = mutableListOf<Usuario>()

    fun registrarUsuario(usuario: Usuario) {
        listaUsuarios.add(usuario)
    }

    fun obtenerUsuarios(): List<Usuario> = listaUsuarios
}
