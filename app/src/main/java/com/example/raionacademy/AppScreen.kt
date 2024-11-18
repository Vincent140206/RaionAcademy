package com.example.raionacademy

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController

@Composable
@Preview

fun AppScreen(navController: NavHostController = rememberNavController()) {
    val appList = listOf(
        AppObject.sepatu,
        AppObject.celana,
        AppObject.vga,
        AppObject.kaos,
        AppObject.jamtangan,
        AppObject.laptop,
        AppObject.handphone,
        AppObject.keyboard,
        AppObject.earbuds,
        AppObject.meja,
        AppObject.mio,
        AppObject.tipex,
        AppObject.horeg
    )
    LazyVerticalGrid(
        columns = GridCells.Fixed(2),
        contentPadding = PaddingValues(16.dp),
        verticalArrangement = Arrangement.spacedBy(17.dp),
        horizontalArrangement = Arrangement.spacedBy(17.dp),
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        items(appList) {
                appEntity -> AppWidget(appEntity) {
            navController.navigate("detail_screen/${appEntity.name}")
        }
        }
    }
}