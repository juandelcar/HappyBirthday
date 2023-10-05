package com.example.greetingcard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.greetingcard.ui.theme.GreetingCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GreetingCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    Greeting("Juan",  "Mexico")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, city : String) {
    Column {
        Image(painter = painterResource(id = R.drawable.fondos_de_pantalla_coches_4k_2_scaled),
            contentDescription = "Un Auto en 4k ",
            modifier = Modifier.size(100.dp)
                .clip(CircleShape)
                .border(2.dp, MaterialTheme.colorScheme.secondary, CircleShape)
        )
        Surface(color = Color.Cyan) {
            Text(
                text = "Hi, I'm $name!",
                modifier = Modifier.padding(24.dp)
            )
        }

        Surface(color = Color.Green) {
            Text(
                text = "I'm from $city ",
                modifier = Modifier.padding(24.dp)
            )
        }
    }

} 

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    GreetingCardTheme {
        Greeting("Juan", "Mexico")
    }
}