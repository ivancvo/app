package com.example.midasoft.models

data class Usuario (
    val _id: String? = null,
    val Nombre_Usu: String,
    val Contraseña_Usu: String,
    val Email_Usu: String,
    val Telefono_Usu: String,
    val Fecha_Inicio_Contrato_Usu:String?,
    val Cedula_Usu: String,
    val Id_Rol : Int
)