package com.ztstudios.spotify.homeScreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
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
import com.ztstudios.spotify.R
import com.ztstudios.spotify.components.AvatarUser
import com.ztstudios.spotify.ui.theme.PrimaryColor

@Preview
@Composable
fun HeaderApp () {
  Row (
    verticalAlignment = Alignment.CenterVertically,
    modifier = Modifier
      .fillMaxWidth()
      .height(32.dp)

  ) {
    AvatarUser()
    Spacer(modifier = Modifier.width(8.dp))
    Text(text = "Bryan Turrubiates", color = Color.White, fontWeight = FontWeight.Medium)
  }
}