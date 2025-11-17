package com.example.pizzariacariege

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.pizzariacariege.ui.theme.PizzariaCariegeTheme
import com.example.pizzariacariege.views.Login
import com.example.pizzariacariege.views.SignUp
import com.example.pizzariacariege.views.Splash

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PizzariaCariegeTheme{
                val navController = rememberNavController()
                NavHost(
                    navController = navController,
                    startDestination = "Splash"
                ){
                    composable("Splash"){
                        Splash(navController)
                    }

                    composable("Login") {
                        Login(navController)
                    }

                    composable("SignUp") {
                        SignUp(navController)
                    }
                }
            }
        }
    }
}
