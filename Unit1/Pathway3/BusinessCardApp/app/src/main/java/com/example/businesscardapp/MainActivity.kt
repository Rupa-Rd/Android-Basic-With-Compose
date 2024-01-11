package com.example.businesscardapp

import android.graphics.drawable.Icon
import android.os.Bundle
import android.text.Layout
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.ExitToApp
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.rounded.Menu
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.unit.dp
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.businesscardapp.ui.theme.BusinessCardAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCardAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    BusinessCardGreeting()
                }
            }
        }
    }
}

@Composable
fun IntroductionGreeting(modifier: Modifier = Modifier){
    val image = painterResource(id = R.drawable.profile_image)
    Column (

        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(
            painter = image,
            contentDescription = null,

        )
        Text(
            text = "Roopa Dharshini",
            fontSize = 25.sp,
            fontWeight = FontWeight.Bold,

        )
        Text(
            text = "Student at SRM",

        )
    }
}

@Composable
fun SocialsGreeting(modifier: Modifier = Modifier){

    Column (verticalArrangement = Arrangement.spacedBy(20.dp)) {
        Row {
            Icon(Icons.Filled.Person, contentDescription = null)
            Text(
                text = "\tAlready connect in LinkedIn?"
            )
        }

        Row {
            Icon(Icons.Filled.ExitToApp, contentDescription = null)
            Text(
                text = "\tCheckout my GitHub"
            )
        }

        Row {
            Icon(Icons.Filled.Email, contentDescription = null)
            Text(text = "\tContact me!")
        }
    }
}

@Composable
fun BusinessCardGreeting(modifier: Modifier = Modifier){
    Box (
        modifier = Modifier.padding(0.dp,200.dp)
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(80.dp)
        ){
            IntroductionGreeting()

            SocialsGreeting()
        }


    }
}
@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    BusinessCardAppTheme {
        BusinessCardGreeting()
    }
}