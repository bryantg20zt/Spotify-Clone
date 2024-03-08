package com.ztstudios.spotify.playlists

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ztstudios.spotify.R
import com.ztstudios.spotify.misc.Playlist
import com.ztstudios.spotify.ui.theme.PrimaryColor

@Composable
fun PlaylistRow (item: Playlist) {
  Row (
    verticalAlignment = Alignment.CenterVertically,
    modifier = Modifier
      .fillMaxWidth()
      .height(52.dp)
  ) {
    Image(painter = painterResource(id = R.drawable.album1), contentDescription = item.image)
    Spacer(modifier = Modifier.width(8.dp))
    Column {
      Text(text = item.nombre, color = Color.White)
      Row (
        verticalAlignment = Alignment.CenterVertically
      ) {
        Icon(
          modifier = Modifier
            .width(12.dp)
            .height(12.dp)
            .background(color = PrimaryColor, shape = RoundedCornerShape(16.dp)),
          imageVector = Icons.Default.KeyboardArrowDown,
          contentDescription = "Download",
          tint = Color.Black
        )
        Spacer(modifier = Modifier.width(8.dp))
        Text(text = item.type, color = Color.Gray, fontSize = 12.sp)
        Spacer(modifier = Modifier.width(8.dp))
        Column (
          modifier = Modifier
            .width(4.dp)
            .height(4.dp)
            .background(color = Color.Gray, shape = RoundedCornerShape(16.dp))
        ) {}
        Spacer(modifier = Modifier.width(4.dp))
        Text(text = "${item.cantidad} Canciones", color = Color.Gray, fontSize = 12.sp)
      }
    }
  }
}