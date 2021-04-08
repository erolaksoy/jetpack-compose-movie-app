package com.example.composemovieapp.design

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composemovieapp.R
import com.example.composemovieapp.ui.theme.PreviewWithTheme

@Composable
fun CardView(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxWidth()
            .padding(16.dp)
    ) {
        Image(
            painter = painterResource(id = R.drawable.ic_launcher_foreground),
            contentDescription = null,
            modifier = modifier
                .heightIn(min = 180.dp)
                .fillMaxWidth()
                .clip(shape = MaterialTheme.shapes.medium),
            contentScale = ContentScale.Crop
        )

        Spacer(modifier = modifier.height(16.dp))
        Text(
            text = "Yaygın inancın tersine, Lorem Ipsum rastgele sözcüklerden oluşmaz",
            style = MaterialTheme.typography.h6
        )
        Text(
            text = "Erol Aksoy",
            style = MaterialTheme.typography.body2
        )

    }
}

@Composable
@Preview("CardPreviewLightTheme")
fun CardPreviewLightTheme() {
    PreviewWithTheme(false) {
        CardView()
    }
}

@Composable
@Preview("CardPreviewDarkTheme")
fun CardPreviewDarkTheme() {
    PreviewWithTheme(true) {
        CardView()
    }
}