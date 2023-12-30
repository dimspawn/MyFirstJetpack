package com.imaginatic.myfirstjetpack.ui

import androidx.compose.material3.DrawerState
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.Surface
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.imaginatic.myfirstjetpack.MainViewModel
import com.imaginatic.myfirstjetpack.ui.components.AppDrawerContent
import com.imaginatic.myfirstjetpack.ui.components.appdrawer.AppDrawerItemInfo
import com.imaginatic.myfirstjetpack.ui.theme.MyFirstJetpackTheme
import com.imaginatic.myfirstjetpack.R

@Composable
fun MainDrawer(
    navController: NavHostController = rememberNavController(),
    drawerState: DrawerState = rememberDrawerState(initialValue = DrawerValue.Closed),
    mainViewModel: MainViewModel
) {
    MyFirstJetpackTheme {
        Surface {
            ModalNavigationDrawer(
                drawerState = drawerState,
                drawerContent = {
                    AppDrawerContent(
                        drawerState = drawerState,
                        menuItems = DrawerParams.drawerButtons,
                        defaultPick = MainNavOption.HomeScreen
                    ) { onUserPickedOption ->
                        when (onUserPickedOption) {
                            MainNavOption.HomeScreen -> {
                                navController.navigate(onUserPickedOption.name) {
                                    popUpTo(NavRoutes.MainRoute.name)
                                }
                            }
                            MainNavOption.FavoriteScreen -> {
                                navController.navigate(onUserPickedOption.name) {
                                    popUpTo(NavRoutes.MainRoute.name)
                                }
                            }
                        }
                    }
                }
            ) {
                NavHost(
                    navController,
                    startDestination = NavRoutes.MainRoute.name
                ) {
                    mainGraph(drawerState, mainViewModel)
                }
            }
        }
    }
}

enum class NavRoutes {
    MainRoute
}

object DrawerParams {
    val drawerButtons = arrayListOf(
        AppDrawerItemInfo(
            MainNavOption.HomeScreen,
            R.string.drawer_home,
            R.drawable.cottege,
            R.string.drawer_home_description
        ),
        AppDrawerItemInfo(
            MainNavOption.FavoriteScreen,
            R.string.drawer_about,
            R.drawable.bolt,
            R.string.drawer_info_description
        )
    )
}