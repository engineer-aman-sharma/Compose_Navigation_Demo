package com.aman.compose.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.aman.compose.navigation.ui.DetailScreen
import com.aman.compose.navigation.ui.HomeScreen

@Composable
fun NavGraph(navController: NavHostController) {
    NavHost(navController, startDestination = "home") {
        composable("home") {
            HomeScreen(navController)
        }
        composable("detail/{user}") {backStackEntry->
            val name = backStackEntry.arguments?.getString("user")?:"Unknown"
            DetailScreen(navController, name)
        }
    }
}