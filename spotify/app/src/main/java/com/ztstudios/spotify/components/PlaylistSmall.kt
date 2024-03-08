package com.ztstudios.spotify.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ztstudios.spotify.R
import com.ztstudios.spotify.ui.theme.SecodaryColor

@Preview
@Composable
fun PlaylistSmall () {
  Row (
    verticalAlignment = Alignment.CenterVertically,
    modifier = Modifier
      .width(175.dp)
      .height(44.dp)
      .background(color = SecodaryColor, shape = RoundedCornerShape(4.dp))
      .padding(end = 12.dp)
  ) {
    Image(
      painter = painterResource(id = R.drawable.album1),
      contentDescription = "trapicheo",
      modifier = Modifier
        .clip(shape = RoundedCornerShape(bottomStart = 4.dp, topStart = 4.dp))
    )
    Spacer(Modifier.width(8.dp))
    Text("Trapicheo (Mixtape)", color = Color.White, modifier = Modifier.weight(1f), fontSize = 12.sp, lineHeight = 16.sp)
  }
}