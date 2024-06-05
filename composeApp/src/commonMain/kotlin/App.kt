import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.ui.tooling.preview.Preview
import dice_game1.composeapp.generated.resources.Res
import dice_game1.composeapp.generated.resources.dice_1
import dice_game1.composeapp.generated.resources.dice_2
import dice_game1.composeapp.generated.resources.dice_3
import dice_game1.composeapp.generated.resources.dice_4
import dice_game1.composeapp.generated.resources.dice_5
import dice_game1.composeapp.generated.resources.dice_6
import dice_game1.composeapp.generated.resources.compose_multiplatform
import kotlin.random.Random

@OptIn(ExperimentalResourceApi::class)
@Composable
@Preview
fun App() {
    MaterialTheme {

        var image by remember { mutableStateOf(Res.drawable.dice_1) }
       // var by remember{ mutableStateOf(false) }
        Column(

           modifier = Modifier .background(color = Color.DarkGray).padding(32.dp).fillMaxSize() ,horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text("Welcome to World's Best Game", fontWeight = FontWeight.Bold, )
           // var image by remember { mutableStateOf(Res.drawable.dice_1) }
            Image(painterResource(image), contentDescription = null)
           //Text("Welcome to World's Best Game")

                   Button(onClick = ({
                       var random= Random.nextInt(6)+1
                       when(random) {
                        1 ->   image = Res.drawable.dice_1
                        2 ->   image = Res.drawable.dice_2
                        3 ->   image = Res.drawable.dice_3
                        4 ->   image = Res.drawable.dice_4
                        5 ->   image = Res.drawable.dice_5
                        6 ->   image = Res.drawable.dice_6
                           else -> image= Res.drawable.compose_multiplatform
                       }
                       println(random)
                   })){
                       Text("Roll Dice")
                   }


        }
    }
}