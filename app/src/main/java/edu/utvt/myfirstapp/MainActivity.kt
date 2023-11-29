package edu.utvt.myfirstapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
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
import edu.utvt.myfirstapp.ui.theme.MyFirstAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyFirstAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Card("World!!!")
                }
            }
        }
    }
}

@Composable
fun Banner(modifier: Modifier = Modifier): Unit{
    val image = painterResource(id = R.drawable.android_developers);
    Image(painter = image, contentDescription = null, modifier = modifier);
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview(){
    MyFirstAppTheme {
        Card("World")
    }
}
@Composable
fun Greeting(name: String, modifier: Modifier = Modifier){
    Text(
        text = "Hello $name!",
        textAlign = TextAlign.Center,
        modifier = modifier
    )
}

@Composable
fun Card(name: String, modifier: Modifier = Modifier): Unit{
    Column(
        verticalArrangement = Arrangement.Center,
    ) {
        Banner(Modifier.align(alignment = Alignment.CenterHorizontally))

        Greeting(
            name = "World!!!",
            Modifier
                .padding(16.dp)
                .align(alignment = Alignment.CenterHorizontally)
        )

    }
}