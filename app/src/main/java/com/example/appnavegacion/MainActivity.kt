package com.example.app22

import android.os.Bundle
import android.provider.CalendarContract.Colors
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.paddingFromBaseline
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusRequester.Companion.createRefs
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.core.app.NotificationCompat.Style
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.example.appnavegacion.R

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            appNavegacion{
                Surface(color = MaterialTheme.colors.background) {
                    Pantalla1()
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun MyPreview(){
    appNavegacion{
        Greeting("Android")
    }
    Pantalla1()
}

@Composable
fun Pantalla1(){
    //val navigationController = rememberNavController()
    //NavHost(navController = navigationController, startDestination = Pantalla1.route){

    //}
    ConstraintLayout(modifier = Modifier.fillMaxHeight().fillMaxWidth()
        .background(colorResource(R.color.backgraound))
    ) {
        val (titulo, introNombre, introContra, nombre, contra,intro) = createRefs()
        Box(
            modifier = Modifier.constrainAs(titulo){
                top.linkTo(parent.top)
                start.linkTo(parent.start)
                end.linkTo(parent.end)
            }){
            Text(
                text = "Pantalla 1",
                color = Color.White,
                textAlign = TextAlign.Center,
                fontSize = 30.sp,
                modifier = Modifier
                    .width(200.dp)
                    .padding(20.dp)
            )
        }


        Box(modifier = Modifier.fillMaxWidth().padding(10.dp).constrainAs(introNombre){
            top.linkTo(titulo.bottom)
        }){
            var text by remember { mutableStateOf("") }
            val brush = remember {
                val RainbowRed = Color(0xFFDA034E)
                val RainbowOrange = Color(0xFFFF9800)
                val RainbowYellow = Color(0xFFFFEB3B)
                val RainbowGreen = Color(0xFF4CAF50)
                val RainbowBlue = Color(0xFF2196F3)
                val RainbowIndigo = Color(0xFF3F51B5)
                val RainbowViolet = Color(0xFF9C27B0)

                val rainbowColors = listOf(
                    RainbowRed,
                    RainbowOrange,
                    RainbowYellow,
                    RainbowGreen,
                    RainbowBlue,
                    RainbowIndigo,
                    RainbowViolet
                )

                Brush.linearGradient(
                    colors = rainbowColors
                )
            }
            OutlinedTextField(
                modifier = Modifier.fillMaxWidth(),
                value = text,
                textStyle = TextStyle(brush = brush),
                onValueChange = { text = it },
                label = { Text("Nombre") }
            )
        }

        Box(modifier = Modifier.fillMaxWidth().padding(10.dp).constrainAs(introContra){
            top.linkTo(introNombre.bottom)
        }){
            var password by remember { mutableStateOf("") }
            val brush = remember {
                val RainbowRed = Color(0xFFDA034E)
                val RainbowOrange = Color(0xFFFF9800)
                val RainbowYellow = Color(0xFFFFEB3B)
                val RainbowGreen = Color(0xFF4CAF50)
                val RainbowBlue = Color(0xFF2196F3)
                val RainbowIndigo = Color(0xFF3F51B5)
                val RainbowViolet = Color(0xFF9C27B0)

                val rainbowColors = listOf(
                    RainbowRed,
                    RainbowOrange,
                    RainbowYellow,
                    RainbowGreen,
                    RainbowBlue,
                    RainbowIndigo,
                    RainbowViolet
                )

                Brush.linearGradient(
                    colors = rainbowColors
                )
            }


            OutlinedTextField(
                modifier = Modifier.fillMaxWidth(),
                value = password,
                onValueChange = { password = it },
                textStyle = TextStyle(brush = brush),
                label = { Text("Contraseña") },
                visualTransformation = PasswordVisualTransformation(),
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password)
            )

        }

        Box(modifier = Modifier.fillMaxWidth().padding(10.dp).constrainAs(intro,
            constrainBlock = TODO()
        )){
            FilledTonalButton(onClick = { }) {
                Text("Tonal")
            }
        }

    }

}