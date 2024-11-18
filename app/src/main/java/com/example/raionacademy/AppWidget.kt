package com.example.raionacademy

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage

@Composable
@Preview

fun AppWidget(
    appEntity: AppEntity = AppObject.sepatu,
    onClick: (appEntity:AppEntity) -> Unit = {}
) {
    Column (
        modifier = Modifier
            .width(170.dp)
            .height(215.dp)
            .background(Color.White)
            .clip(RoundedCornerShape(16.dp))
            .padding(bottom = 4.dp)
            .clickable {
                onClick(appEntity)
            }
    ) {
        Card(
            shape = RoundedCornerShape(
                topStart = 16.dp,
                topEnd = 16.dp,
                bottomStart = 0.dp,
                bottomEnd = 0.dp
            ),
            modifier = Modifier
                .fillMaxWidth()
                .height(150.dp)
                .shadow(4.dp)
        ) {
            AsyncImage(
                model = appEntity.image,
                contentDescription = appEntity.name,
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
            Text(appEntity.name, fontSize = 16.sp, fontWeight = FontWeight.Bold)
            Spacer(
                modifier = Modifier.padding(1.dp)
            )
            Text(appEntity.rating, fontSize = 11.sp)
        }
    }
}

@Composable
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
                topStart = 16.dp,
                topEnd = 16.dp,
                bottomStart = 0.dp,
                bottomEnd = 0.dp
            ),
            modifier = Modifier
                .fillMaxWidth()
                .height(120.dp)
                .shadow(4.dp)
        ){
            AsyncImage(
                model = appDetail.image,
                contentDescription = appDetail.name,
                modifier = Modifier.fillMaxSize(),
                contentScale = ContentScale.Crop
            )
        }
    }
}