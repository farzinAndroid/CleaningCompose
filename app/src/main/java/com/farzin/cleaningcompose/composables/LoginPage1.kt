package com.farzin.cleaningcompose.composables

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.material.icons.filled.Lock
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.farzin.cleaningcompose.ui.theme.Purplish
import java.util.*
import com.farzin.cleaningcompose.R
import com.farzin.cleaningcompose.ui.theme.Orangish


@Composable
fun LoginPage1() {


    Box {

        BGCard()

        MainCard()

    }
}




@Composable
fun  BGCard(){
    val signUpText = buildAnnotatedString {
        append("Don't Have an Account? ")
        withStyle(SpanStyle(color = Orangish)){
            append("Sign Up")
        }
    }

    Surface(
        color = Purplish,
        modifier = Modifier
            .fillMaxSize()
    ) {

        Column(
            verticalArrangement = Arrangement.Bottom,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.offset(y = (-50).dp)
        ) {
            Row(modifier = Modifier.padding(horizontal = 10.dp) ) {

                Image(
                    painter = painterResource(id = R.drawable.facebook),
                    contentDescription = "",
                    modifier = Modifier.size(40.dp)
                )
                Spacer(modifier = Modifier.padding(horizontal = 8.dp))
                Image(
                    painter = painterResource(id = R.drawable.google),
                    contentDescription = "",
                    modifier = Modifier.size(40.dp)
                )
                Spacer(modifier = Modifier.padding(horizontal = 8.dp))
                Image(
                    painter = painterResource(id = R.drawable.twitter),
                    contentDescription = "",
                    modifier = Modifier.size(40.dp)
                )

            }
            Spacer(modifier = Modifier.padding(vertical = 8.dp))
            Text(text = signUpText, color = Color.White)
        }
    }
}


@Composable
fun MainCard() {

    var emailV by remember {
        mutableStateOf("")
    }

    var passwordV by remember {
        mutableStateOf("")
    }

    var passwordIconState by remember {
        mutableStateOf(false)
    }




    Surface(
        color = Color.White,
        modifier = Modifier
            .height(600.dp)
            .fillMaxWidth(),
        shape = RoundedCornerShape(bottomStart = 20.dp, bottomEnd = 20.dp)
    ) {
        Column(
            modifier = Modifier
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(painter = painterResource(id = R.drawable.vaccum), contentDescription = "")
            Spacer(modifier = Modifier.height(30.dp))

            OutlinedTextField(
                value = emailV, onValueChange = {
                    emailV = it
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp),
                label = { Text(text = "Email") },
                leadingIcon = {
                    IconButton(onClick = { /*TODO*/ }) {
                        Icon(imageVector = Icons.Filled.Email,
                            contentDescription = "")
                    }
                },
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email)
            )

            Spacer(modifier = Modifier.height(30.dp))

            OutlinedTextField(
                value = passwordV,
                onValueChange = {
                    passwordV = it
                },

                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp),
                label = { Text(text = "Password") },
                visualTransformation = if (passwordIconState) PasswordVisualTransformation() else VisualTransformation.None,
                leadingIcon = {
                    IconButton(onClick = {
                        passwordIconState = !passwordIconState
                    }) {
                        Icon(
                            imageVector = Icons.Filled.Lock,
                            contentDescription = "",
                            tint = if (passwordIconState) Orangish else Color.Gray,
                        )
                    }
                },
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),

                )
            Spacer(modifier = Modifier.height(12.dp))

            Text(text = "Forgot Password?",
                color = Color.Gray,
                textAlign = TextAlign.End

            )

            Spacer(modifier = Modifier.height(12.dp))

            Button(
                onClick = { /*TODO*/ },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp),
                colors = ButtonDefaults.buttonColors(
                    backgroundColor = Orangish,
                    contentColor = Color.White
                ),
                contentPadding = PaddingValues(12.dp)


            ) {
                Text(text = "Login")

            }

        }
    }
}




