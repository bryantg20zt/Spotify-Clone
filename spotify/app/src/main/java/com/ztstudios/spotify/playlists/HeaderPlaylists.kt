package com.ztstudios.spotify.playlists

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.AssistChip
import androidx.compose.material3.ChipColors
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.ztstudios.spotify.components.AvatarUser
import com.ztstudios.spotify.ui.theme.SecodaryColor

@Composable
fun HeaderPlaylist (navController: NavController) {
  Column {
    Row (
      verticalAlignment = Alignment.CenterVertically,
      horizontalArrangement = Arrangement.SpaceBetween,
      modifier = Modifier
        .fillMaxWidth()
        .background(color = SecodaryColor)
        .padding(16.dp)
    ) {
      Row (
        verticalAlignment = Alignment.CenterVertically
      ) {
        AvatarUser()
        Spacer(modifier = Modifier.width(8.dp))
        Text(text = "Tu biblioteca", color = Color.White, fontWeight = FontWeight.Medium, fontSize = 24.sp)
      }
      Icon(
        imageVector = Icons.Default.Add,
        contentDescription = "Add Playlist",
        tint = Color.White,
        modifier = Modifier
          .clickable { navController.navigate("add") }
      )
    }
    Row (
      horizontalArrangement = Arrangement.SpaceBetween,
      modifier = Modifier
        .fillMaxWidth()
        .background(color = SecodaryColor)
        .padding(start = 12.dp, end = 12.dp)
    ) {
      AssistChip(shape = RoundedCornerShape(16.dp), onClick = { /*TODO*/ }, label = { Text(text = "Playlists", fontSize = 12.sp, color = Color.Gray) })
      AssistChip(shape = RoundedCornerShape(16.dp), onClick = { /*TODO*/ }, label = { Text(text = "Albumes", fontSize = 12.sp, color = Color.Gray)  })
      AssistChip(shape = RoundedCornerShape(16.dp), onClick = { /*TODO*/ }, label = { Text(text = "Artistas", fontSize = 12.sp, color = Color.Gray) })
      AssistChip(shape = RoundedCornerShape(16.dp), onClick = { /*TODO*/ }, label = { Text(text = "Descargados", fontSize = 12.sp, color = Color.Gray) })
    }
  }
}