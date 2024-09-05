package com.example.exercices


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.Role.Companion.Image
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.exercices.ui.theme.ExercicesTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ExercicesTheme {
                GreetingText("Salut à toi !\nJ'espère que tu passes un bon moment. ",
                    "Damien",
                    modifier = Modifier.padding(16.dp))
            }
        }
    }
}

@Composable
fun GreetingText(message: String, from: String, modifier: Modifier = Modifier){

    Column(verticalArrangement = Arrangement.Center, modifier = modifier) {
        Text(
            text = message,
            fontSize = 40.sp,
            lineHeight = 80.sp,
            textAlign = TextAlign.Center
        )
        Text(
            text = "$from :D",
            fontSize = 20.sp,
            modifier = Modifier
                .padding(16.dp)
                .align(alignment = Alignment.End)
        )
    }
}

@Composable
fun GreetingImage(message: String, from: String, modifier: Modifier = Modifier) {
    val image = painterResource(R.drawable.androidparty)
    Image(
        painter = image,
        contentDescription = "'Sup"
    )
}

@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
fun GreetingPreview(modifier: Modifier = Modifier) {
    ExercicesTheme {
        //GreetingText("Salut à toi !\nJ'espère que tu passes un bon moment. ","Damien")
        GreetingImage("Salut à toi !\nJ'espère que tu passes un bon moment. ","Damien")
    }
}

