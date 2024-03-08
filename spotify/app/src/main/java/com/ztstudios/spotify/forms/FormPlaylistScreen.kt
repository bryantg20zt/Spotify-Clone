package com.ztstudios.spotify.forms

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import com.ztstudios.spotify.playlists.HeaderForm
import com.ztstudios.spotify.playlists.PlaylistForm
import com.ztstudios.spotify.ui.theme.BackgroundColor

@Composable
fun FormPlaylistScreen (navController: NavController) {
  Column (
    horizontalAlignment = Alignment.CenterHorizontally,
    modifier = Modifier
      .fillMaxSize()
      .background(color = BackgroundColor)
  ) {
    HeaderForm(navController)
    PlaylistForm()
  }
}