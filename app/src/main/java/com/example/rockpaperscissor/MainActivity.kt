package com.example.rockpaperscissor

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.runtime.*
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.rockpaperscissor.ui.theme.RockPaperScissorTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            RockPaperScissorTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color(0xFFB3E5FC)
                ) {
                     GameScreen()
                }
            }
        }
    }
}
@Composable
fun GameScreen() {
    val buttonColors = ButtonDefaults.buttonColors(
        backgroundColor = Color(0xFF4DB6AC),
        contentColor = MaterialTheme.colors.onSecondary
    )

    Box(modifier = Modifier.fillMaxSize()) {
        Image(
            painterResource(id = R.drawable.lawn),
            contentDescription = "Background Image",
            modifier = Modifier.fillMaxSize()
                .align(Alignment.BottomCenter)
        )

        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight()
                .padding(top = 450.dp),
            verticalArrangement = Arrangement.Center
        ) {
            Button(
                onClick = { /*TODO*/ },
                colors = buttonColors,
                shape = RoundedCornerShape(20.dp),
                modifier = Modifier
                    .height(50.dp)
                    .width(300.dp)
            ) {
                Image(
                    painterResource(id = R.drawable.paper),
                    contentDescription = "Paper Image",
                    modifier = Modifier.size(64.dp)
                )
                Text(text = "Paper", modifier = Modifier.padding(start = 10.dp)
                ,color = Color.White)
            }
            Spacer(modifier = Modifier.height(16.dp))
            Button(
                onClick = { /*TODO*/ },
                colors = buttonColors,
                shape = RoundedCornerShape(20.dp),
                modifier = Modifier
                    .height(50.dp)
                    .width(300.dp)
            ) {
                Image(
                    painterResource(id = R.drawable.stone),
                    contentDescription = "Rock Image",
                    modifier = Modifier.size(64.dp)
                )
                Text(text = "Rock", modifier = Modifier.padding(start = 10.dp),color = Color.White)
            }
            Spacer(modifier = Modifier.height(16.dp))
            Button(
                onClick = { /*TODO*/ },
                colors = buttonColors,
                shape = RoundedCornerShape(20.dp),
                modifier = Modifier
                    .height(50.dp)
                    .width(300.dp)
            ) {
                Image(
                    painterResource(id = R.drawable.scissors),
                    contentDescription = "Scissor Image",
                    modifier = Modifier.size(64.dp)
                )
                Text(text = "Scissor", modifier = Modifier.padding(start = 10.dp),color = Color.White)
            }
        }
    }
}




@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    RockPaperScissorTheme {

    }
}