package com.example.midasoft.activities

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import com.example.midasoft.R
import com.example.midasoft.controllers.UsuarioController
import com.example.midasoft.models.Usuario

class UsuarioActivity : AppCompatActivity() {

    private lateinit var nombreEdit: EditText
    private lateinit var correoEdit: EditText
    private lateinit var passEdit: EditText
    private lateinit var cedulaEdit: EditText
    private lateinit var telefonoEdit: EditText
    private lateinit var rolEdit: EditText
    private lateinit var btnGuardar: Button

    private val controller = UsuarioController()

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_usuario)

        nombreEdit = findViewById(R.id.editNombre)
        correoEdit = findViewById(R.id.editCorreo)
        passEdit = findViewById(R.id.editPassword)
        cedulaEdit = findViewById(R.id.editCedula)
        telefonoEdit = findViewById(R.id.editTelefono)
        rolEdit = findViewById(R.id.editRol)
        btnGuardar = findViewById(R.id.btnGuardar)

        btnGuardar.setOnClickListener {
            val nuevoUsuario = Usuario(
                Nombre_Usu = nombreEdit.text.toString(),
                Contraseña_Usu = passEdit.text.toString(),
                Email_Usu = correoEdit.text.toString(),
                Telefono_Usu = telefonoEdit.text.toString(),
                Cedula_Usu = cedulaEdit.text.toString(),
                Fecha_Inicio_Contrato_Usu = null,
                Id_Rol = rolEdit.text.toString().toInt()
            )

            controller.crearUsuario(nuevoUsuario){
                Toast.makeText(this, "Usuario creado", Toast.LENGTH_SHORT).show()
            }
        }
    }
}