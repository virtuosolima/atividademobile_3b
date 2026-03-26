package com.example.myapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.myapp.ui.theme.MyAppTheme
import androidx.compose.material3.Text
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.ui.res.painterResource
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            Column(modifier = Modifier.padding(16.dp)) {

                MessageCard(
                    Message("Android", "Jetpack Compose", R.drawable.profile)
                )

                Spacer(modifier = Modifier.height(16.dp))

                MessageCard(
                    Message("Leticia", "Aprendendo Jetpack Compose", R.drawable.bob)
                )

                Spacer(modifier = Modifier.height(16.dp))

                MessageCard(
                    Message("Lexi", "Compose é incrível!", R.drawable.cachorro)
                )
            }
        }
    }
}

data class Message(
    val author: String,
    val body: String,
    val image: Int
)

@Composable
fun MessageCard(msg: Message) {
    Row(modifier = Modifier.padding(all = 8.dp)) {

        Image(
            painter = painterResource(msg.image),
            contentDescription = "Foto de perfil",
            modifier = Modifier
                .size(40.dp)
                .clip(CircleShape)
        )

        Spacer(modifier = Modifier.width(8.dp))

        Column {

            Text(text = msg.author)

            Spacer(modifier = Modifier.height(4.dp))

            Text(text = msg.body)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewMessageCard() {

    Column(modifier = Modifier.padding(16.dp)) {

        MessageCard(
            Message("Nerd", "Oii, vamos ler diário de um banana!", R.drawable.profile)
        )

        Spacer(modifier = Modifier.height(16.dp))

        MessageCard(
            Message("BOB", "topa sair para comer hamburguer de siri?", R.drawable.bob)
        )

        Spacer(modifier = Modifier.height(16.dp))

        MessageCard(
            Message("Sr. Bolota", "Amo viver!", R.drawable.cachorro)
        )
    }
}
