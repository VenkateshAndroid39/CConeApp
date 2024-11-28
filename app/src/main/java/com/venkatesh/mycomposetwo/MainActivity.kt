package com.venkatesh.mycomposetwo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.venkatesh.mycomposetwo.ui.theme.MyComposeTwoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyComposeTwoTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Venkatesh",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
Column {
    Text(
        text = "Hello $name!",
        modifier = modifier,
        color = Color.Green
    )
    Text(
        text = "Hello $name!",
        modifier = modifier,
        color = Color.Blue
    )
    Text(
        text = "Hello $name!",
        modifier = modifier,
        color = Color.Yellow
    )
}
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MyComposeTwoTheme {
        Greeting("Venkatesh working daiii :)")
    }
}