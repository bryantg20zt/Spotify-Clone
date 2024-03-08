package com.ztstudios.spotify.playlists


import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.ztstudios.spotify.misc.MainViewModel
import com.ztstudios.spotify.misc.Playlist

val viewModel = MainViewModel()
val playlistData = viewModel.playlistsData

@Preview
@Composable
fun ListPlaylists() {
  val scrollState = rememberLazyListState()
  var currentPlaylist by remember { mutableStateOf<Playlist?>(null) }

  LazyColumn(state = scrollState, modifier = Modifier.padding(start = 16.dp, top = 16.dp, end = 16.dp, bottom = 0.dp)) {
    items(playlistData) { item ->
      PlaylistRow(item)
      Spacer(modifier = Modifier.height(12.dp))
    }
  }

}