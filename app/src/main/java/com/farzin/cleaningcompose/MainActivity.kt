package com.farzin.cleaningcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import com.farzin.cleaningcompose.composables.LoginPage1
import com.farzin.cleaningcompose.composables.Navraph
import com.farzin.cleaningcompose.composables.OnBoardingPage1
import com.farzin.cleaningcompose.ui.theme.CleaningComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val windows = this.window
        windows.statusBarColor = 0xFFFFFF

        setContent {

            val navController = rememberNavController()

            CleaningComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background) {
                    Navraph(navController =navController )
                }
            }
        }
    }
}



