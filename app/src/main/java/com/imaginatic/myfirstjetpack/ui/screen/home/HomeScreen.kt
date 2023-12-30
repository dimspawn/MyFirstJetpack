package com.imaginatic.myfirstjetpack.ui.screen.home

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.DrawerState
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import com.imaginatic.myfirstjetpack.MainViewModel
import com.imaginatic.myfirstjetpack.R
import com.imaginatic.myfirstjetpack.ui.components.appbar.AppBar
import com.imaginatic.myfirstjetpack.ui.screen.home.section.HomeContent
import com.imaginatic.myfirstjetpack.ui.screen.home.section.HomeText
import com.myfirstjetpack.core.data.Resource

@Composable
fun HomeScreen(drawerState: DrawerState, mainViewModel: MainViewModel) {
    Scaffold(
        topBar = {
            AppBar(
                drawerState = drawerState,
                title = R.string.drawer_home
            )
        }
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(it)
        ) {
            mainViewModel.movies.collectAsState(initial = Resource.Loading()).value.let { movies ->
                when(movies) {
                    is Resource.Loading -> { HomeText(text = "Loading...") }
                    is Resource.Success -> { HomeContent(movies = movies.data) }
                    is Resource.Error -> { HomeText(text = "Error Happened") }
                }
            }

        }
    }
}