package com.example.moviesapp.ui

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.moviesapp.ui.detail.screens.DetailScreen
import com.example.moviesapp.ui.home.screens.HomeScreen

@Composable
fun MoviesAppNavGraph(
    modifier: Modifier = Modifier,
    navController: NavHostController,
    startDestination:String = MoviesAppRoutes.Home.route
) {

    NavHost(
        modifier = modifier,
        navController = navController,
        startDestination = startDestination
    ){

        composable(route = MoviesAppRoutes.Home.route){
            HomeScreen()
        }

        composable(route = MoviesAppRoutes.Detail.route){
            DetailScreen()
        }

    }



}