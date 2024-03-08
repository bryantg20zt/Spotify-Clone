package com.ztstudios.spotify.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.ztstudios.spotify.R
import com.ztstudios.spotify.ui.theme.PrimaryColor

@Preview
@Composable
fun AvatarUser () {
  Image(
    painter = painterResource(id = R.drawable.avatar),
    contentDescription = "Avatar",
    modifier = Modifier
      .width(32.dp)
      .height(32.dp)
      .clip(CircleShape)
      .border(0.5.dp, PrimaryColor, CircleShape)
  )
}