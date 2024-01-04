package com.example.wiprocodetestapplication.presentation.ui.compose

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.wiprocodetestapplication.domain.model.Movie

@Composable
fun MovieItem(
    movie: Movie,
    onItemClick: (Movie) -> Unit
) {
    Row(
        modifier = Modifier
            .clickable { onItemClick(movie) }
            .padding(vertical = 16.dp, horizontal = 16.dp)
            .fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically
    ) {

        CoilImage(imageUrl = movie.posterPath)

        Spacer(modifier = Modifier.width(16.dp))
        Column {
            Text(
                text = movie.title,
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp,
                maxLines = 1,
                overflow = TextOverflow.Ellipsis
            )
            Spacer(modifier = Modifier.height(8.dp))
            Text(
                text = movie.releaseDate,
                fontWeight = FontWeight.Normal,
                fontSize = 16.sp,
                maxLines = 1,
                overflow = TextOverflow.Ellipsis
            )
        }
    }
}
