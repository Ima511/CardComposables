package com.example.cardcomposables

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.cardcomposables.ui.theme.CardComposablesTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CardComposablesTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    MyUI()
                }
            }
        }
    }
}

@Composable
fun MyUI() {
    // Cards : Are surfaces that display content and actions
    Column(
        Modifier
            .background(Color.Red)
            .fillMaxSize()) {
        Card(
            elevation = CardDefaults.cardElevation(20.dp),
            modifier = Modifier.padding(all = 16.dp),
            border = BorderStroke(width = 4.dp, color = Color.Blue),
            colors = CardDefaults.cardColors(Color.Cyan),
            shape = RoundedCornerShape(size = 26.dp)
            ) {
            Text(text = "Hello Cards!",
            fontSize = 40.sp,
                lineHeight = 40.sp
                )
        }
    }

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    CardComposablesTheme {
        MyUI()
    }
}