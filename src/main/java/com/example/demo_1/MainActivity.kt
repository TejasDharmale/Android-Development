package com.example.demo_1

import android.os.Bundle
import android.os.Message
import com.example.demo_1.ui.theme.Demo_1Theme
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.modifier.modifierLocalOf
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp




class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Demo_1Theme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background) {
                    BirthdayGreetingWithImage("Happy Birthday Robin Hood", from="From Emma")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = " $name!")
}
@Composable
fun BirthdayGreetingWithText(message: String,from:String){
    Column() {

        Text(
            text = message,
            fontSize = 36.sp,
            modifier = Modifier
                .fillMaxSize()
                .wrapContentWidth(Alignment.Start)
                .padding(start =  16.dp,top=16.dp)


        )

        Text(
            text = from,
            fontSize = 24.sp ,
            modifier = Modifier
                .fillMaxSize()
                .wrapContentWidth(Alignment.Start)
                .padding(start =  16.dp,top=16.dp)

        )
    }
}
@Composable
fun BirthdayGreetingWithImage(message: String, from: String){
    val image = painterResource(R.drawable.androidparty__1_)
    Box {
        Image(
            painter = image, contentDescription = null, modifier = Modifier.fillMaxSize()
                .fillMaxSize(), contentScale = ContentScale.Crop
        )
    }
    BirthdayGreetingWithText(message = message, from = from )

}
@Preview(showBackground = true)
@Composable
fun BirthdayCardPreview() {
    Demo_1Theme {

        BirthdayGreetingWithImage("Happy Birthday Robin Hood" , "-From Emma" )

    }
}