package com.example.appnavegacion.screens

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun Pantalla1(){
    Scaffold() {
        BodyContent()
    }
}

@Composable
fun BodyContent(){
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("Hola navegacion")
        Button(onClick = {/*TODO*/}) {
            Text("Navega")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview(){
    Pantalla1()
}