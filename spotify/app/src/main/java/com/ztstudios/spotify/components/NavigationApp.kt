package com.ztstudios.spotify.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.List
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import com.ztstudios.spotify.ui.theme.SecodaryColor

@Composable
fun BottomNavigation (navController: NavController) {
  NavigationBar (
    containerColor = SecodaryColor
  )
  {
    NavigationBarItem(
      selected = false,
      onClick = { navController.navigate("home") },
      icon = {
        Icon(
          imageVector = Icons.Default.Home,
          contentDescription = "Home",
          tint = Color.White
        )
      }
    )
    NavigationBarItem(
      selected = false,
      onClick = { /*TODO*/ },
      icon = {
        Icon(
          imageVector = Icons.Default.Search,
          contentDescription = "Home",
          tint = Color.Gray
        )
      }
    )
    NavigationBarItem(
      selected = false,
      onClick = { navController.navigate("playlists") },
      icon = {
        Icon(
          imageVector = Icons.Default.List,
          contentDescription = "PLaylists",
          tint = Color.Gray
        )
      }
    )
  }
}