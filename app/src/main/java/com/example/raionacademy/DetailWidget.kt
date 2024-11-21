package com.example.raionacademy

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage

@Composable
@Preview

fun ProductDetailWidget(
    appDetail: AppDetail = ProductDetail.sepatu
) {
    Column (
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ){
        Card (
            shape = RoundedCornerShape(
                topStart = 0.dp,
                topEnd = 0.dp,
                bottomStart = 16.dp,
                bottomEnd = 16.dp
            ),
            modifier = Modifier
                .fillMaxWidth()
                .height(260.dp)
        ){
            AsyncImage(
                model = appDetail.image,
                contentDescription = appDetail.name,
                modifier = Modifier.fillMaxSize(),
                contentScale = ContentScale.Crop
            )
        }
        Column (
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight()
                .padding(top = 6.dp, start = 3.dp)
        ) {
            Text(appDetail.name, fontSize = 16.sp, fontWeight = FontWeight.Bold)
            Spacer(
                modifier = Modifier.padding(1.dp)
            )
            Text(appDetail.rating, fontSize = 11.sp)
        }
    }
}