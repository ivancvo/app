package com.example.bya.modelos.productos

class Categoria (private var nombreCat: String,
                 private var descripcionCat: String,
                 private var subcategoriaId: Int) {
    fun getNombreCat(): String = nombreCat
    fun getdescripcionCat(): String = descripcionCat
    fun getsubcategoriaId(): Int = subcategoriaId
}

