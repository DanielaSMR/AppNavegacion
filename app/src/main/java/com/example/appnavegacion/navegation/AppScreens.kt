package com.example.appnavegacion.navegation

sealed class AppScreens(val route: String) {
    object Pantalla1: AppScreens("Pantalla_1")
    object Pantalla2: AppScreens("Pantalla_2")
    object Pantalla3: AppScreens("Pantalla_3")
}