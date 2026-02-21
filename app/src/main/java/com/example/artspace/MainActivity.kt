package com.example.artspace

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.artspace.ui.theme.ArtSpaceTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ArtSpaceTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    ArtWithImageAndText(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}

data class Artwork(val imageRes: Int, val titleRes: Int, val descriptionRes: Int)

@Composable
fun ArtWithImageAndText(modifier: Modifier = Modifier) {
    val artworks = listOf(
        Artwork(R.drawable.bridge, R.string.bridge, R.string.bridge1),
        Artwork(R.drawable.flowpaint, R.string.flower, R.string.flower1)
    )

    var currentArtworkIndex by remember { mutableStateOf(0) }

    Column(
        modifier = modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        val currentArtwork = artworks[currentArtworkIndex]

        Image(
            painter = painterResource(id = currentArtwork.imageRes),
            contentDescription = null,
        )
        Spacer(modifier = Modifier.height(16.dp))
        Text(
            text = stringResource(currentArtwork.titleRes),
            fontSize = 24.sp
        )
        Spacer(modifier = Modifier.height(8.dp))
        Text(
            text = stringResource(currentArtwork.descriptionRes),
            fontSize = 24.sp
        )
        Spacer(modifier = Modifier.height(16.dp))
        Row {
            Button(
                onClick = {
                    currentArtworkIndex = (currentArtworkIndex - 1 + artworks.size) % artworks.size
                },
            ) {
                Text(text = "Previous")
            }
            Spacer(modifier = Modifier.width(16.dp))
            Button(
                onClick = { 
                    currentArtworkIndex = (currentArtworkIndex + 1) % artworks.size
                },
            ) {
                Text(text = "Next")
            }
        }
    }
}