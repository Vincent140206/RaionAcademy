package com.example.raionacademy

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.FabPosition
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
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
        AppObject.horeg,
        AppObject.parfum
    )
    LazyVerticalGrid(
        columns = GridCells.Fixed(2),
        contentPadding = PaddingValues(16.dp),
        verticalArrangement = Arrangement.spacedBy(17.dp),
        horizontalArrangement = Arrangement.spacedBy(17.dp),
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(top = 20.dp)
    ) {
        items(appList) {
                appEntity -> AppWidget(appEntity) {
            navController.navigate("detail_screen/}")
            }
        }
    }
    var count by remember {
        mutableStateOf(0)
    }
    Scaffold (
        floatingActionButton = {
            FloatingActionButton(
                onClick = {
                    if (count != 0) {
                        count--
                    }
                },
                shape = CircleShape,
                containerColor = Color(0xFF5A1D80),
                contentColor = Color.White,
                modifier = Modifier
                    .width(84.dp)
                    .height(84.dp)
            ) {
                Text(text = count.toString(), fontSize = 24.sp)
            }
        }, floatingActionButtonPosition = FabPosition.End
    ) { innerPadding ->
        Column (
            modifier = Modifier
                .fillMaxSize()
                .background(Color.White)
                .padding(innerPadding)
    ) {
            LazyVerticalGrid(
                columns = GridCells.Fixed(2),
                contentPadding = PaddingValues(
                    start = 20.dp,
                    end = 20.dp,
                    top = 12.dp,
                    bottom = innerPadding.calculateBottomPadding()+20.dp
                ),
                horizontalArrangement = Arrangement.spacedBy(20.dp),
                verticalArrangement = Arrangement.spacedBy(20.dp),
                modifier = Modifier.background(Color.White)
            ) {
                items(appList) {
                        appEntity -> AppWidget(appEntity, onClick = {
                            count++
                })
                }
            }
        }
    }
}