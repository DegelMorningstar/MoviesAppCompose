package com.example.moviesapp.ui.home.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import com.example.moviesapp.ui.components.SearchField
import com.example.moviesapp.ui.components.Title
import com.example.moviesapp.ui.theme.MoviesAppTheme
import com.example.moviesapp.ui.theme.background

@Composable
fun HomeScreen() {

    HomeSreenMainContent()

}

@Composable
private fun HomeSreenMainContent(
    modifier: Modifier = Modifier
) {
    LazyColumn(
        modifier = modifier
            .fillMaxSize()
            .background(background)
    ) {

        item {
            Title()
        }
        item {
            SearchField()
        }

    }
}


@Preview(showBackground = true, showSystemUi = true, device = Devices.PIXEL_4)
@Composable
fun HomeScreenMainContenPreview() {
    MoviesAppTheme {
        HomeSreenMainContent()
    }
}