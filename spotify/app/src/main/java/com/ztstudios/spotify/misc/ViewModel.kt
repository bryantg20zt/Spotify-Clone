package com.ztstudios.spotify.misc

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.currentRecomposeScope
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.ztstudios.spotify.R
import com.ztstudios.spotify.playlists.playlistData

data class Playlist (
  var nombre: String,
  var cantidad: Int,
  var type: String,
  var downloaded: Boolean,
  var image: String
)

class MainViewModel : ViewModel () {
  val playlistsData: MutableState<List<Playlist>> = mutableStateOf(
    listOf(
      Playlist(nombre = "Tap Argentino", cantidad = 10, type = "playlist", downloaded = true, image = R.drawable.album1.toString()),
      Playlist(nombre = "Khea", cantidad = 5, type = "playlist", downloaded = false, image = "khea.jpg"),
      Playlist(nombre = "Duki", cantidad = 8, type = "playlist", downloaded = true, image = "duki.jpg"),
      Playlist(nombre = "Wos", cantidad = 12, type = "playlist", downloaded = true, image = "wos.jpg"),
      Playlist(nombre = "Cazzu", cantidad = 15, type = "playlist", downloaded = true, image = "cazzu.jpg"),
      Playlist(nombre = "Nicki Nicole", cantidad = 20, type = "playlist", downloaded = false, image = "nicki_nicole.jpg"),
      Playlist(nombre = "Beyoncé", cantidad = 30, type = "album", downloaded = true, image = "beyonce.jpg"),
      Playlist(nombre = "Bad Bunny", cantidad = 40, type = "album", downloaded = true, image = "bad_bunny.jpg"),
      Playlist(nombre = "Maluma", cantidad = 65, type = "album", downloaded = true, image = "maluma.jpg"),
      Playlist(nombre = "Rihanna", cantidad = 75, type = "album", downloaded = true, image = "rihanna.jpg")
    )
  )

  private var currentPlaylist : Playlist? = null

  fun setCurrentUser (user: Playlist) {
    currentPlaylist = user
  }

  fun handleAddPlaylist (playlist: Playlist) {
    val currentList = playlistsData.value.toMutableList()
    currentList.add(playlist)
    playlistsData.value = currentList
  }

}