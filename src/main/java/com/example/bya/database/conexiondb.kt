package com.example.bya.database

import java.sql.Connection
import java.sql.DriverManager

class ConexionBD {
    private val url = "jdbc:mysql://localhost:3306/tienda"
    private val user = "root"
    private val password = "1227"

    fun conectar(): Connection? {
        return try {
            DriverManager.getConnection(url, user, password)
        } catch (e: Exception) {
            println("Error al conectar a la base de datos: ${e.message}")
            null
        }
    }
}
