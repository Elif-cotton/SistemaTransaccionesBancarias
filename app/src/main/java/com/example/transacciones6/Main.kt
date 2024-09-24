package com.example.transacciones6

fun main() {
    // Crear tres cuentas bancarias
    val cuentaMaria = CuentaBancaria("Maria", 1000.0)
    val cuentaJuan = CuentaBancaria("Juan", 500.0)
    val cuentaCarlos = CuentaBancaria("Carlos", 1500.0)

    // Realizar transacciones en la cuenta de Maria
    cuentaMaria.deposito(700.0)
    cuentaMaria.retiro(200.0)
    cuentaMaria.retiro(100.0)
    cuentaMaria.deposito(400.0)
    cuentaMaria.retiro(800.0)  // Intento de retiro fallido

    // Realizar transacciones en la cuenta de Juan
    cuentaJuan.deposito(300.0)
    cuentaJuan.retiro(200.0)
    cuentaJuan.deposito(150.0)
    cuentaJuan.retiro(1000.0) // Intento de retiro fallido
    cuentaJuan.retiro(50.0)

    // Realizar transacciones en la cuenta de Carlos
    cuentaCarlos.deposito(500.0)
    cuentaCarlos.retiro(200.0)
    cuentaCarlos.retiro(150.0)
    cuentaCarlos.deposito(200.0)
    cuentaCarlos.retiro(2000.0) // Intento de retiro fallido
    
    // Mostrar el historial de las tres cuentas
    cuentaMaria.mostrarHistorial()
    println() // Salto de línea
    cuentaJuan.mostrarHistorial()
    println() // Salto de línea
    cuentaCarlos.mostrarHistorial()
}