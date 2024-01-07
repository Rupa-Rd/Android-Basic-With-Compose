package com.example.taskmanagerapp

import android.os.Bundle
import androidx.compose.ui.Alignment
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.taskmanagerapp.ui.theme.TaskManagerAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TaskManagerAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    TaskManagerGreeting()
                }
            }
        }
    }
}

@Composable
fun TaskManagerGreeting(modifier: Modifier=Modifier){
    val image = painterResource(id = R.drawable.taskmanagerbackground)
    Column (verticalArrangement = Arrangement.Center,) {

            Image(
                painter = image,
                contentDescription = null,
                modifier = Modifier.align(Alignment.CenterHorizontally)
            )

        Text(
            text = "All tasks Completed",
            fontWeight = FontWeight.Bold,

            modifier = Modifier
                .padding(0.dp,24.dp,0.dp,8.dp)
                .align(Alignment.CenterHorizontally)


        )
        Text(
            text = "Nice work!",
            fontSize = 16.sp,
            modifier = Modifier.align(Alignment.CenterHorizontally)
        )
    }
}



@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    TaskManagerAppTheme {
        TaskManagerGreeting()
    }
}