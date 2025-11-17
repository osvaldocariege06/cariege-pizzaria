package com.example.pizzariacariege.views

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.pizzariacariege.R
import com.example.pizzariacariege.ui.theme.BROWN900
import com.example.pizzariacariege.ui.theme.GRAY900
import com.example.pizzariacariege.ui.theme.ORANGE

@Composable
fun SignUp(
    navController: NavController? = null
){
    Column(
        modifier = Modifier.fillMaxSize().background(
            brush = Brush.linearGradient(
                colors = listOf(
                    GRAY900,
                    BROWN900,
                    GRAY900,
                    GRAY900,
                )
            )
        ).verticalScroll(rememberScrollState()),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Image(
            painter = painterResource(R.drawable.logo),
            contentDescription = null,
            modifier = Modifier
                .width(400.dp)
                .height(420.dp),
            contentScale = ContentScale.Crop,
            alignment = Alignment.Center,
        )

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

@Preview
@Composable
private fun SignUpPreview(){
    SignUp()
}