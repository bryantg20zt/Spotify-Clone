package com.ztstudios.spotify.playlists

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.ztstudios.spotify.ui.theme.SecodaryColor

@Composable
fun HeaderForm (navController: NavController) {
  Row (
    verticalAlignment = Alignment.CenterVertically,
    modifier = Modifier
      .fillMaxWidth()
      .background(SecodaryColor)
      .padding(16.dp)
  ) {
    Icon(
      imageVector = Icons.Default.ArrowBack,
      contentDescription = "Back",
      tint = Color.White,
      modifier = Modifier
        .clickable { navController.navigate("playlists") }
    )
    Spacer(modifier = Modifier.width(8.dp))
    Text(text = "Agregar a la biblbioteca", color = Color.White, fontSize = 20.sp, fontWeight = FontWeight.Medium)
  }
}