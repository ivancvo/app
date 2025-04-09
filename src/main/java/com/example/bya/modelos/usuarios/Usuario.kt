package com.example.bya.modelos.usuarios

data class Usuario(
    val nombreUsuario: String,
    val contrasena: String,
    val cedula: String,
    val correo: String,
    val telefono: String,
    val rol: Rol
)

enum class Rol {
    ADMIN, EMPLEADO
}
