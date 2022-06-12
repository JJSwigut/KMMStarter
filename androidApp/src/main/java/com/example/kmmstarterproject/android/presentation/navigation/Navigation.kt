package com.example.kmmstarterproject.android.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.kmmstarterproject.android.presentation.map.MapScreen
import com.example.kmmstarterproject.android.presentation.preferences.PreferencesScreen

@Composable
fun Navigation(){
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = Screen.Map.route,
    ){
        composable(route = Screen.Map.route){ navBackStackEntry ->
            MapScreen(navController)
        }
        composable(route = Screen.Preferences.route){ navBackStackEntry ->
            PreferencesScreen(navController)
        }
    }
}