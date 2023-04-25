package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Colors
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.textInputServiceFactory
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                // A surface container using the 'background' color from the theme
                Surface(

                ) {
                    PlanoDefundo()
                }
            }
        }
    }
}

@Composable
fun PlanoDefundo(){
    Image(
        painter = painterResource(id = R.drawable.fundo),
        contentDescription = null,
        contentScale = ContentScale.Crop
        )
    Cabecalho()

}

@Composable
fun Cabecalho() {
    Colors()
    Image(painter = , contentDescription = )
}
    Text{
    text = ¨Isaac Teodoro¨
}
 Text{
    text = ¨isaac¨
 }


