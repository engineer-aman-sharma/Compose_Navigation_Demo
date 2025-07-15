package com.aman.compose.navigation.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.ExtendedFloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun DetailScreen(navController: NavController, userName: String) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.Black), horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text("2 : Detail Screen", fontSize = 15.sp, color = Color.White)

        Spacer(modifier = Modifier.height(8.dp))

        Text("Home Screen Sent : ${userName.ifBlank { "Nothing" }}", color = Color.White, fontSize = 14.sp, modifier = Modifier.background(Color.Gray))

        Spacer(modifier = Modifier.height(8.dp))

        ExtendedFloatingActionButton(
            onClick = {
                navController.popBackStack()
            },
            icon = { Icon(Icons.AutoMirrored.Filled.ArrowBack, contentDescription = "Back") },
            text = { Text("Click to go back") })
    }
}