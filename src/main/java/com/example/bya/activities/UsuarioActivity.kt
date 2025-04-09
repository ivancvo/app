package com.example.bya.activities

import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import com.example.bya.R
import com.example.bya.controladores.UsuarioController
import com.example.bya.modelos.usuarios.Rol
import com.example.bya.modelos.usuarios.Usuario

class UsuarioActivity : AppCompatActivity() {

    private val controlador = UsuarioController()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.usuario_activity)

        val etNombreUsuario = findViewById<EditText>(R.id.etNombreUsuario)
        val etContrasena = findViewById<EditText>(R.id.etContrasena)
        val etCedula = findViewById<EditText>(R.id.etCedula)
        val etCorreo = findViewById<EditText>(R.id.etCorreo)
        val etTelefono = findViewById<EditText>(R.id.etTelefono)
        val spinnerRol = findViewById<Spinner>(R.id.spinnerRol)
        val btnRegistrar = findViewById<Button>(R.id.btnRegistrar)

        // Cargar roles en el Spinner
        val roles = Rol.values().map { it.name }
        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, roles)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinnerRol.adapter = adapter

        btnRegistrar.setOnClickListener {
            val usuario = Usuario(
                nombreUsuario = etNombreUsuario.text.toString(),
                contrasena = etContrasena.text.toString(),
                cedula = etCedula.text.toString(),
                correo = etCorreo.text.toString(),
                telefono = etTelefono.text.toString(),
                rol = Rol.valueOf(spinnerRol.selectedItem.toString())
            )

            controlador.registrarUsuario(usuario)
            Toast.makeText(this, "Usuario registrado", Toast.LENGTH_SHORT).show()
        }
    }
}
