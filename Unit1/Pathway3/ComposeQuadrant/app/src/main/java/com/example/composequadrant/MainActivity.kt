package com.example.composequadrant

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composequadrant.ui.theme.ComposeQuadrantTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeQuadrantTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ComposeQuadrantGreeting()
                }
            }
        }
    }
}


@Composable
fun ComposeQuadrantGreeting(modifier: Modifier = Modifier){
    Card {
        Column {
            Text(text = "Text composable")
            Text(text = "Displays text and follows the recommended Material Design guidelines.")
        }
        
    }
    Column {
        Row {
            Text(
                text = "Text Composable",

                modifier = Modifier
                    .weight(0.5F)
                    .fillMaxHeight(0.5f)
                    .background(color = Color(0xFFEADDFF))
            )
            Text(
                text = "D",
                modifier = Modifier
                    .weight(0.5F, true)
                    .fillMaxHeight(0.5f)
                    .background(color = Color(0xFFD0BCFF))
            )
        }
        Row {
            Text(
                text = "A",
                modifier = Modifier
                    .weight(0.5F, true)
                    .fillMaxHeight(1f)
                    .background(color = Color(0xFFB69DF8))
            )
            Text(
                text = "B",
                modifier = Modifier
                    .weight(0.5F, true)
                    .fillMaxHeight(1f)
                    .background(color = Color(0xFFF6EDFF))
            )
        }
    }




}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ComposeQuadrantTheme {
        ComposeQuadrantGreeting()
    }
}