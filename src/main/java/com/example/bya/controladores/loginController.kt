package com.example.bya.controladores

import com.example.bya.database.ConexionBD
import java.sql.ResultSet

class LoginController {
    private val conexion = ConexionBD()

    fun autenticar(usuario: String, contrasena: String): Boolean {
        val conn = conexion.conectar() ?: return false


        val query = "SELECT * FROM usuarios WHERE correo = ? AND contrasena = ?"
        val stmt = conn.prepareStatement(query)
        stmt.setString(1, usuario)
        stmt.setString(2, contrasena)

        val rs: ResultSet = stmt.executeQuery()
        return rs.next() // Si encuentra al usuario, devuelve true
    }
}
