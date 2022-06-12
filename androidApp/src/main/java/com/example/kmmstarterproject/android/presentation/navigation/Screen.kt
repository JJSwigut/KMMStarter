package com.example.kmmstarterproject.android.presentation.navigation

sealed class Screen(
    val route: String
){
    object Map: Screen("mapScreen")

    object Preferences: Screen ("preferencesScreen")
}
