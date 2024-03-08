package com.ztstudios.spotify.homeScreen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.ztstudios.spotify.components.PlaylistSmall

@Preview
@Composable
fun PlaylistHomeScreen () {
  Column {
    Row (
      horizontalArrangement = Arrangement.SpaceBetween,
      modifier = Modifier.fillMaxWidth()
    ) {
      PlaylistSmall()
      PlaylistSmall()
    }
    Spacer(
      modifier = Modifier.height(8.dp))
    Row (
      horizontalArrangement = Arrangement.SpaceBetween,
      modifier = Modifier.fillMaxWidth()
    ) {
      PlaylistSmall()
      PlaylistSmall()
    }
    Spacer(modifier = Modifier.height(8.dp))
    Row (
      horizontalArrangement = Arrangement.SpaceBetween,
      modifier = Modifier.fillMaxWidth()
    ) {
      PlaylistSmall()
      PlaylistSmall()
    }
    Spacer(modifier = Modifier.height(8.dp))
    Row (
      horizontalArrangement = Arrangement.SpaceBetween,
      modifier = Modifier.fillMaxWidth()
    ) {
      PlaylistSmall()
      PlaylistSmall()
    }
  }
}