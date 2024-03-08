package com.ztstudios.spotify.misc

import androidx.compose.runtime.currentRecomposeScope
import androidx.lifecycle.ViewModel
import com.ztstudios.spotify.R

data class Playlist (
  val nombre: String,
  val cantidad: Int,
  val type: String,
  val downloaded: Boolean,
  val image: String
)

class MainViewModel : ViewModel () {
  val playlistsData: MutableList<Playlist> = mutableListOf(
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

  private var currentPlaylist : Playlist? = null

  fun setCurrentUser (user: Playlist) {
    currentPlaylist = user
  }

  fun handleAddUser (user: Playlist) {
    playlistsData.add(user)
  }

}