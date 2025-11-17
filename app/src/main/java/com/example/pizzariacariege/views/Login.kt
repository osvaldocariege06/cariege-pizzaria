package com.example.pizzariacariege.views


import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.pizzariacariege.ui.theme.BROWN900
import com.example.pizzariacariege.ui.theme.GRAY900
import com.example.pizzariacariege.ui.theme.ORANGE
import com.example.pizzariacariege.ui.theme.PurpleGrey80
import com.example.pizzariacariege.ui.theme.WHITE


@Composable
fun Login(navController: NavController? = null){

    var name by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("")}
    var isEmpty by remember { mutableStateOf(false) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(
                brush = Brush.linearGradient(
                    colors = listOf(
                        GRAY900,
                        BROWN900,
                        GRAY900,
                        GRAY900,
                    )
                )
            )
            .verticalScroll(rememberScrollState()),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(20.dp, 0.dp)

        ) {


            Text(
                text = "Fazer Login",
                color = WHITE,
                fontSize = 25.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .align(
                        alignment = Alignment.CenterHorizontally,
                    )
            )
            Spacer(Modifier.height(10.dp))

            Text(
                text = "Insira suas credencias para fazer login",
                color = PurpleGrey80,
                fontSize = 16.sp,
                modifier = Modifier
                    .padding(20.dp, 0.dp, 20.dp, 30.dp)
                    .align(alignment = Alignment.CenterHorizontally)
            )

            Spacer(Modifier.height(30.dp))

            OutlinedTextField(
                label = {
                    Text(
                        text = "Digite seu nome"
                    )
                },
                value = name,
                onValueChange = {},
                shape = RoundedCornerShape(12.dp),
                modifier = Modifier.fillMaxWidth(),
                supportingText = {
                    if (isEmpty) {
                        Text(
                            text = "Campo obrigatório",
                            color = MaterialTheme.colorScheme.error
                        )

                    }
                }
            )


            OutlinedTextField(
                label = {
                    Text(
                        text = "Digite sua senha"
                    )
                },
                value = password,
                onValueChange = {},
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(12.dp),
                supportingText = {
                    if(isEmpty) {
                        Text(
                            text = "Campo obrigatório",
                            color = MaterialTheme.colorScheme.error
                        )
                    }
                }
            )

            Spacer(Modifier.height(16.dp))

            Button(
                onClick = {
                    isEmpty = true
                },
                colors = ButtonDefaults.buttonColors(
                    containerColor = ORANGE
                ),
                shape = RoundedCornerShape(12.dp),
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(
                    text = "Fazer login"
                )
            }
            Spacer(Modifier.height(8.dp))
            
            Button(
                onClick = {
                    navController?.navigate("Splash")
                },
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.Transparent
                ),
                border = BorderStroke(width = 2.dp, color = ORANGE),
                shape = RoundedCornerShape(12.dp),
                modifier = Modifier.fillMaxWidth()
            ){
                Text(
                    text = "Voltar"
                )
            }
        }
    }


}

@Preview
@Composable
private fun LoginPreview(){
    Login()
}