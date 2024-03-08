package com.ztstudios.spotify.playlists

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Checkbox
import androidx.compose.material3.CheckboxDefaults
import androidx.compose.material3.Switch
import androidx.compose.material3.SwitchDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ztstudios.spotify.misc.Playlist
import com.ztstudios.spotify.ui.theme.PrimaryColor

@Preview
@Composable
fun PlaylistForm () {
  val playlist by remember {
    mutableStateOf(
      Playlist(
        nombre = "",
        cantidad = 0,
        type = "Playlist",
        downloaded = false,
        image = ""
      )
    )
  }
  Column (
    modifier = Modifier
      .fillMaxWidth()
      .padding(16.dp)
  ) {
    Text(text = "Nombre de la playlist", color = Color.White)
    TextField(value = playlist.nombre, onValueChange = { playlist.nombre = it })
    Text(text = "Cantidad", color = Color.White)
    TextField(
      keyboardOptions = KeyboardOptions(
        keyboardType = KeyboardType.Number
      ),
      value = playlist.cantidad.toString(),
      onValueChange = { newValue ->
        newValue.toIntOrNull()?.let { parsedValue ->
          playlist.cantidad = parsedValue
        }
      }
    )
    Text(text = "Playlist", color = Color.White)
    Switch(
      colors = SwitchDefaults.colors(
        checkedThumbColor = Color.White,
        checkedTrackColor = PrimaryColor
      ),
      checked = true,
      onCheckedChange = { if (it) playlist.type = "Playlist" else playlist.type = "Albumn"}
    )
    Text(text = "Descargar", color = Color.White)
    Checkbox(
      checked = true,
      onCheckedChange = { playlist.downloaded = it },
      colors = CheckboxDefaults.colors(
        checkedColor = PrimaryColor
      )
    )
    Button(
      colors = ButtonDefaults.buttonColors(containerColor = PrimaryColor),
      onClick = { /*TODO*/ },
      modifier = Modifier
        .fillMaxWidth()
        .height(52.dp)
    ) {
      Text(text = "Agregar a la biblioteca", fontSize = 16.sp, fontWeight = FontWeight.Medium)
    }
  }
}