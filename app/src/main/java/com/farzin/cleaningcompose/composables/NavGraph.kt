package com.farzin.cleaningcompose.composables

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable


@Composable
fun Navraph(
    navController: NavHostController
){
    NavHost(
        navController = navController,
        startDestination = Screens.OnBoardingPage.route){

        composable(route = Screens.OnBoardingPage.route){
            OnBoardingPage1(navController)
        }

        composable(route = Screens.Login.route){
            LoginPage1()
        }
    }
}