package com.ztstudios.spotify.homeScreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ztstudios.spotify.R

@Preview
@Composable
fun PodcastRecommendedSingle () {
  Column {
    Image(
      painter = painterResource(id = R.drawable.album1),
      contentDescription = "Playlists",
      modifier = Modifier
        .height(115.dp)
        .clip(RoundedCornerShape(4))
    )
    Spacer(modifier = Modifier.height(8.dp))
    Text(
      text = "Creativo",
      fontSize = 10.sp,
      color = Color.White,
      fontWeight = FontWeight.Medium,
      modifier = Modifier.padding(start = 4.dp)
    )
    Text(
      text = "Podcast",
      fontSize = 10.sp,
      color = Color.Gray,
      fontWeight = FontWeight.Medium,
      modifier = Modifier.padding(start = 4.dp)
    )
  }
}

@Preview
@Composable
fun PodcastRecommended () {
  Row (
    horizontalArrangement = Arrangement.SpaceBetween,
    modifier = Modifier
      .fillMaxWidth()
  ) {
    PodcastRecommendedSingle()
    PodcastRecommendedSingle()
    PodcastRecommendedSingle()
  }
}