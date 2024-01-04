package com.example.wiprocodetestapplication.presentation.ui.compose

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import coil.compose.rememberImagePainter
import com.example.wiprocodetestapplication.R

@Composable
fun CoilImage(imageUrl: String) {
    Image(
        painter = rememberImagePainter(
            data = "https://image.tmdb.org/t/p/w600_and_h900_bestv2${imageUrl}",
            builder = {
                // Optional: Add image transformations
                placeholder(R.drawable.ic_launcher_foreground)
            }
        ),
        contentDescription = "Coil Image",
        modifier = Modifier
            .size(80.dp)
            .clip(RoundedCornerShape(4.dp))
    )
}