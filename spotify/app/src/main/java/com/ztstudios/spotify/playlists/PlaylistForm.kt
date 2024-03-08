package com.ztstudios.spotify.playlists

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Checkbox
import androidx.compose.material3.CheckboxDefaults
import androidx.compose.material3.Snackbar
import androidx.compose.material3.Switch
import androidx.compose.material3.SwitchDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.ztstudios.spotify.R
import com.ztstudios.spotify.misc.Playlist
import com.ztstudios.spotify.ui.theme.PrimaryColor
import com.ztstudios.spotify.misc.MainViewModel


@SuppressLint("CoroutineCreationDuringComposition")
@Composable
fun PlaylistForm (viewModel: MainViewModel, navController: NavController) {
  var showSnack by remember {
    mutableStateOf(true)
  }
  var showAlert  by remember {
    mutableStateOf(false)
  }

  fun handleAdd(playlist: Playlist) {
    viewModel.handleAddPlaylist(playlist)
    navController.navigate("playlists")
  }

  var playlist by remember {
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
  Column(
    horizontalAlignment = Alignment.CenterHorizontally,
    modifier = Modifier
      .fillMaxWidth()
      .padding(16.dp)
  ) {
    Image(
      modifier = Modifier
        .width(200.dp)
        .height(200.dp)
        .clip(shape = RoundedCornerShape(4)),
      painter = painterResource(id = R.drawable.album1),
      contentDescription = "Album Caratula"
    )
    Spacer(modifier = Modifier.height(16.dp))
    Column(modifier = Modifier.fillMaxWidth()) {
      Text(text = "Nombre de la playlist", color = Color.White)
      TextField(
        value = playlist.nombre,
        onValueChange = { playlist = playlist.copy(nombre = it) },
        modifier = Modifier.fillMaxWidth()
      )
    }
    Spacer(modifier = Modifier.height(16.dp))
    Column(modifier = Modifier.fillMaxWidth()) {
      Text(text = "Cantidad", color = Color.White)
      TextField(
        modifier = Modifier.fillMaxWidth(),
        keyboardOptions = KeyboardOptions(
          keyboardType = KeyboardType.Number
        ),
        value = playlist.cantidad.toString(),
        onValueChange = { newValue ->
          newValue.toIntOrNull()?.let { parsedValue ->
            playlist = playlist.copy(cantidad = parsedValue)
          }
        }
      )
    }
    Spacer(modifier = Modifier.height(16.dp))
    Column(
      modifier = Modifier.fillMaxWidth()
    ) {
      Text(text = "Playlist", color = Color.White)
      Switch(
        colors = SwitchDefaults.colors(
          checkedThumbColor = Color.White,
          checkedTrackColor = PrimaryColor
        ),
        checked = playlist.type == "Playlist",
        onCheckedChange = {
          playlist = if (it) playlist.copy(type = "Playlist") else playlist.copy(type = "Albumn")
        }
      )
    }
    Spacer(modifier = Modifier.height(16.dp))
    Column(
      modifier = Modifier.fillMaxWidth()
    ) {
      Text(text = "Descargar", color = Color.White)
      Checkbox(
        checked = playlist.downloaded,
        onCheckedChange = { playlist = playlist.copy(downloaded = it) },
        colors = CheckboxDefaults.colors(
          checkedColor = PrimaryColor
        )
      )
    }
    Spacer(modifier = Modifier.height(16.dp))
    Button(
      colors = ButtonDefaults.buttonColors(containerColor = PrimaryColor),
      onClick = { showAlert = true },
      modifier = Modifier
        .fillMaxWidth()
        .height(52.dp)
    ) {
      Text(text = "Agregar a la biblioteca", fontSize = 16.sp, fontWeight = FontWeight.Medium)
    }
  }
  if (showAlert) {
    AlertDialog(
      icon = { Image(imageVector = Icons.Default.AddCircle, contentDescription = "Agregar") },
      title = { Text("Seguro desea agregar a la biblioteca?") },
      text = { Text("Una vez agregada, se mostrara en la seccion de mi biblioteca.") },
      onDismissRequest = { /*TODO*/ },
      confirmButton = {
        TextButton(onClick = { handleAdd(playlist) }) {
          Text(color = Color.Blue, text = "Agregar")
        }
      },
      dismissButton = {
        TextButton(onClick = { showAlert = false }) {
          Text(text = "Cancelar")
        }
      }
    )
  }
  if (showSnack) {
    Snackbar (
      action = {
        TextButton(onClick = { showSnack = false }) {
          Text(text = "Ok")
        }
      }
    ) {
      Text(text = "Aviso!, carga de imagenes desactivada.")
    }
  }

}