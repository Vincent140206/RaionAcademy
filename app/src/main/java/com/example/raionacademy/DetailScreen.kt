package com.example.raionacademy

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import coil.compose.AsyncImage

@Composable
@Preview
fun DetailScreen(navController: NavHostController = rememberNavController()) {
    val appList = listOf(
        ProductDetail.sepatu,
        ProductDetail.celana,
        ProductDetail.kaos,
        ProductDetail.vga,
        ProductDetail.jamtangan,
        ProductDetail.laptop,
        ProductDetail.horeg,
        ProductDetail.handphone,
        ProductDetail.keyboard,
        ProductDetail.parfum,
        ProductDetail.earbuds,
        ProductDetail.mio,
        ProductDetail.meja,
        ProductDetail.tipex
    )
    LazyColumn (
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        items(appList) {
            appDetail -> ProductDetailWidget(appDetail)
        }
    }
}