package com.ztstudios.spotify


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.Column
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.ztstudios.spotify.homeScreen.HomeScreen
import com.ztstudios.spotify.playlists.PlaylistsScreen
import com.ztstudios.spotify.components.BottomNavigation
import com.ztstudios.spotify.forms.FormPlaylistScreen
import com.ztstudios.spotify.misc.MainViewModel
import com.ztstudios.spotify.ui.theme.SpotifyTheme

class MainActivity : ComponentActivity() {
  private val viewModel: MainViewModel by viewModels()
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContent {
      SpotifyTheme {
        val navController = rememberNavController()
        Column {
          NavHost(navController = navController, startDestination = "home") {
            composable("home") {
              HomeScreen()
            }
            composable("playlists") {
              PlaylistsScreen(navController, viewModel)
            }
            composable("add") {
              FormPlaylistScreen(navController, viewModel)
            }
          }
          BottomNavigation(navController)
        }
      }
    }
  }
}

