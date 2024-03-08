package com.ztstudios.spotify.homeScreen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ztstudios.spotify.ui.theme.BackgroundColor

@Preview
@Composable
fun HomeScreen () {
  Column (
    modifier = Modifier
      .background(color = BackgroundColor)
      .padding(16.dp)
  ) {
    HeaderApp()
    Spacer(modifier = Modifier.height(16.dp))
    PlaylistHomeScreen()
    Spacer(modifier = Modifier.height(16.dp))
    Text("Playlist recomendadas", color = Color.White, fontSize = 20.sp, fontWeight = FontWeight.Medium)
    Spacer(modifier = Modifier.height(16.dp))
    PlaylistRecommended()
    Spacer(modifier = Modifier.height(16.dp))
    Text(text = "Podcast recomendados", color = Color.White, fontSize = 20.sp, fontWeight = FontWeight.Medium)
    Spacer(modifier = Modifier.height(16.dp))
    PodcastRecommended()
  }
}