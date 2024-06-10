package com.example.learntogether

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.learntogether.ui.theme.LearnTogetherTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            LearnTogetherTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ArticleCard(
                        title = stringResource(R.string.primer_elemento),
                        text1 = stringResource(R.string.segundo_elemento),
                        text2 = stringResource(R.string.tercer_elemento),
                        imagePainter = painterResource(R.drawable.bg_compose_background)
                    )
                }
            }
        }
    }
}

@Composable
fun ArticleCard(title: String, text1: String, text2: String, imagePainter: Painter, modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
    ) {
        Image(
            painter = imagePainter,
            contentDescription = null)
        Text(
            text = title,
            fontSize = 24.sp,
            modifier = Modifier
                .padding(16.dp)
        )
        Text(
            text = text1,
            modifier = Modifier
                .padding(
                    start = 16.dp,
                    end = 16.dp
                ),
            textAlign = TextAlign.Justify
        )
        Text(
            text = text2,
            modifier = Modifier
                .padding(16.dp),
            textAlign = TextAlign.Justify

        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    LearnTogetherTheme {
        ArticleCard(
            title = stringResource(R.string.primer_elemento),
            text1 = stringResource(R.string.segundo_elemento),
            text2 = stringResource(R.string.tercer_elemento),
            imagePainter = painterResource(R.drawable.bg_compose_background)
            )
    }
}