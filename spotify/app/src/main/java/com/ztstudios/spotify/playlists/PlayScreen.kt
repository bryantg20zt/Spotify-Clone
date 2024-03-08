package com.ztstudios.spotify.playlists

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.ztstudios.spotify.ui.theme.BackgroundColor
import com.ztstudios.spotify.components.BottomNavigation

@Composable
fun PlaylistsScreen (navController: NavController) {
  Column (
    verticalArrangement = Arrangement.SpaceBetween,
    modifier = Modifier
      .fillMaxSize()
      .background(color = BackgroundColor)
  ) {
    HeaderPlaylist()
    Column (
      modifier = Modifier
        .height(580.dp)
    ) {
      ListPlaylists()
    }
    BottomNavigation(navController = navController)
  }
}