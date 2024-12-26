package com.example.appnavegacion.navegation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.appnavegacion.screens.Pantalla1
import com.example.appnavegacion.screens.Pantalla2

@Composable
fun AppNavigation(){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = AppScreens.Pantalla1.route){
        composable(route = AppScreens.Pantalla1.route){
            Pantalla1()
        }
        composable(route = AppScreens.Pantalla2.route){
            Pantalla2()
        }
    }
}