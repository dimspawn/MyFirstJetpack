package com.imaginatic.myfirstjetpack.ui

import androidx.compose.material3.DrawerState
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.imaginatic.myfirstjetpack.MainViewModel
import com.imaginatic.myfirstjetpack.ui.screen.favorite.FavoriteScreen
import com.imaginatic.myfirstjetpack.ui.screen.home.HomeScreen

fun NavGraphBuilder.mainGraph(drawerState: DrawerState, mainViewModel: MainViewModel) {
    navigation(startDestination = MainNavOption.HomeScreen.name,  route = NavRoutes.MainRoute.name) {
        composable(MainNavOption.HomeScreen.name) {
            HomeScreen(drawerState = drawerState, mainViewModel = mainViewModel)
        }
        composable(MainNavOption.FavoriteScreen.name) {
            FavoriteScreen(drawerState = drawerState)
        }
    }
}

enum class MainNavOption {
    HomeScreen,
    FavoriteScreen
}