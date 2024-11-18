package com.example.raionacademy

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.raionacademy.ui.theme.RaionAcademyTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            RaionAcademyTheme {
                val navController = rememberNavController()
                NavHost(
                    navController = navController,
                    startDestination = "app_Screen"
                ) {
                    composable("app_screen") {
                        AppScreen(navController)
                    }
                    composable("detail_screen/{id}"){
                            backStackEntry ->
                        val name = backStackEntry.arguments?.getString("id")
                        if (name != null) {
                            DetailScreen()
                        } else {
                            Text("Name not found")
                        }
                    }
                }
            }
        }
    }

    @Composable
    fun Greeting(name: String, modifier: Modifier = Modifier) {
        Text(
            text = "Hello $name!",
            modifier = modifier
        )
    }

    @Preview(showBackground = true)
    @Composable
    fun GreetingPreview() {
        RaionAcademyTheme {
            Greeting("Android")
        }
    }
}