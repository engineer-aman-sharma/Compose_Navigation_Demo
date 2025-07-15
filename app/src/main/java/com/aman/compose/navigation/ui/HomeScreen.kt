package com.aman.compose.navigation.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowForward
import androidx.compose.material3.ExtendedFloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun HomeScreen(navController: NavController) {
    var userName by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.Yellow.copy(alpha = 0.2f)),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text("1 : Home Screen", fontSize = 15.sp, color = Color.Black)

        Spacer(modifier = Modifier.height(8.dp))

        TextField(
            modifier = Modifier.heightIn(max = 200.dp)
                .fillMaxWidth()
                .padding(8.dp),
            value = userName,
            onValueChange = { if (it.length <= 20) userName = it },
            placeholder = { Text("Enter data to pass to Detail Screen") }
        )

        Spacer(modifier = Modifier.height(8.dp))

        ExtendedFloatingActionButton(
            onClick = {
                navController.navigate("detail/${userName}") {
                    launchSingleTop = true
                }
            },
            text = { Text("Click to navigate Detail Screen") },
            icon = { Icon(Icons.AutoMirrored.Filled.ArrowForward, contentDescription = "Back") }
        )
    }

}