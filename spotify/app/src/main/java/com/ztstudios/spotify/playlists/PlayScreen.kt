package com.ztstudios.spotify.playlists

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.ztstudios.spotify.ui.theme.BackgroundColor
import com.ztstudios.spotify.components.BottomNavigation
import com.ztstudios.spotify.misc.MainViewModel

@Composable
fun PlaylistsScreen (navController: NavController, viewModel: MainViewModel) {
  Column (
    verticalArrangement = Arrangement.SpaceBetween,
    modifier = Modifier
      .fillMaxSize()
      .background(color = BackgroundColor)
  ) {
    HeaderPlaylist(navController)
    Column (
      modifier = Modifier
        .height(580.dp)
    ) {
      ListPlaylists(viewModel)
    }
    BottomNavigation(navController = navController)
  }
}