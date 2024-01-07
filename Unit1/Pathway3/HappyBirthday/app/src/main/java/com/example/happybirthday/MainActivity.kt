package com.example.happybirthday

import android.os.Bundle
import android.os.Message
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box

import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.stringResource

import com.example.happybirthday.ui.theme.HappyBirthdayTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HappyBirthdayTheme {
                // A surface container using the 'background' color from the theme
                Surface(
//                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    GreetingImage(from = getString(R.string.signature_text), message = getString(R.string.happy_birthday_text))
                }
            }
        }
    }
}

@Composable
fun GreetingText(from: String,message: String,modifier: Modifier = Modifier){

    Column (verticalArrangement = Arrangement.Center, modifier = modifier.padding(8.dp)){
        Text(
            text = message,
            fontSize = 88.sp,
            lineHeight = 100.sp,
            textAlign = TextAlign.Center
        )


        Text(
            text = from,
            fontSize = 30.sp,
            modifier = Modifier.align(Alignment.CenterHorizontally)

        )
    }

}

@Composable
fun GreetingImage(from: String,message: String,modifier: Modifier = Modifier){
    val image = painterResource(id = R.drawable.androidparty)
    Box{

        Image(
            painter = image,
            contentDescription = null,
            contentScale = ContentScale.Crop,
            alpha = 0.8F
        )
        GreetingText(
            from = from,
            message = message,

            modifier = Modifier
                .fillMaxSize()
                .padding(8.dp)
        )
    }

}

@Preview(showBackground = false)
@Composable
fun BirthdayCardPreview() {
    HappyBirthdayTheme {
        //GreetingText(from="From Roopa",message = "Happy Birthday", name = "Roopa!")
        GreetingImage(stringResource(id = R.string.signature_text), stringResource(id = R.string.happy_birthday_text))
    }
}