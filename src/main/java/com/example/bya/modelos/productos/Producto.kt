package com.example.bellayactual.ModuloProductos

class Product (private var nombre: String,
                     private var marca: String,
                     private var medida: String,
                     private var precioBruto: Double,
                     private var iva: Double,
                     private var unidadesTotales: Int,
                     private var estado: String) {
    fun getPrecioNeto(): Double = precioBruto + (precioBruto * iva / 100)
    fun getNombre() = nombre
    fun getMarca() = marca
    fun getMedida() = medida
    fun getPrecioBruto() = precioBruto
    fun getIva() = iva
    fun getUnidadesTotales() = unidadesTotales
    fun getEstado() = estado
}

