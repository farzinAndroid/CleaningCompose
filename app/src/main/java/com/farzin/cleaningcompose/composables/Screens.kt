package com.farzin.cleaningcompose.composables

sealed class Screens(val route:String){
    object OnBoardingPage:Screens(route = "on_boarding_page")
    object Login:Screens(route = "login_page")
}
