package com.example.transacciones6

class CuentaBancaria(private val nombreCuenta: String, private var saldoDisponible: Double) {

    // Lista para almacenar el historial de transacciones
    private val historialTransacciones = mutableListOf<String>()

    // Función para realizar un depósito
    fun deposito(cantidad: Double) {
        saldoDisponible += cantidad
        historialTransacciones.add("$nombreCuenta depositó $$cantidad")
    }

    // Función para realizar un retiro
    fun retiro(cantidad: Double) {
        if (cantidad <= saldoDisponible) {
            saldoDisponible -= cantidad
            historialTransacciones.add("$nombreCuenta retiró $$cantidad")
        } else {
            historialTransacciones.add("$nombreCuenta intentó retirar $$cantidad pero no tiene saldo suficiente")
        }
    }

    // Función para mostrar el historial de transacciones
    fun mostrarHistorial() {
        println("----------- Historial de transacciones - $nombreCuenta -----------")
        for (transaccion in historialTransacciones) {
            println(transaccion)
        }
        println("--------- Fin del historial de $nombreCuenta. Su saldo disponible es de: $$saldoDisponible ---------")
    }
}
