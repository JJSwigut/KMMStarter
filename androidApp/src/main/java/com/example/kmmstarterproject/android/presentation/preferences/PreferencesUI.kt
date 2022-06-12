package com.example.kmmstarterproject.android.presentation.preferences

import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.kmmstarterproject.android.presentation.navigation.Screen

@Composable
fun PreferencesScreen(
    navController: NavController
){
    Surface(modifier = Modifier.fillMaxSize(), color = Color.White){
        Column(modifier = Modifier.fillMaxSize(), verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally){
            Text("Preferences Screen")
            Spacer(Modifier.height(16.dp))
            Button(
                content = { Text("Go To Map") },
                onClick = { navController.navigate(Screen.Map.route)}
            )
        }
    }
}