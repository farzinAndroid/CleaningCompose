package com.farzin.cleaningcompose.composables

import android.graphics.drawable.shapes.Shape
import android.widget.Space
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color

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
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.farzin.cleaningcompose.R
import com.farzin.cleaningcompose.ui.theme.Orangish
import com.farzin.cleaningcompose.ui.theme.Purplish
import com.farzin.cleaningcompose.ui.theme.Shapes


@Composable
fun OnBoardingPage1(navController:NavHostController) {

    Box {
        BGCard2(navController)

        MainCard2()
    }
}


@Composable
fun BGCard2(navController:NavHostController) {


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
            Row(modifier = Modifier.padding(horizontal = 10.dp)) {

                Box(modifier = Modifier
                    .size(10.dp)
                    .background(Color.Gray)
                    .clip(CircleShape)
                )
                Spacer(modifier = Modifier.padding(horizontal = 8.dp))
                Box(modifier = Modifier
                    .size(10.dp)
                    .background(Color.White)
                    .clip(CircleShape)
                )
                Spacer(modifier = Modifier.padding(horizontal = 8.dp))
                Box(modifier = Modifier
                    .clip(Shapes.large)
                    .size(10.dp)
                    .background(Color.Gray)

                )

            }

            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
            ) {

                TextButton(onClick = {

                    navController.navigate(route = Screens.Login.route)

                }) {
                    Text(text = "Skip", color = Color.White)
                }
                Row(verticalAlignment = Alignment.CenterVertically) {
                    TextButton(
                        onClick = { /*TODO*/ },
                    ) {
                        Text(text = "Next", color = Color.White)
                        Spacer(modifier = Modifier.padding(horizontal = 4.dp))
                        Image(painter = painterResource(id = R.drawable.next),
                            contentDescription = "")
                    }
                }
            }
        }
    }
}


@Composable
fun MainCard2() {


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

            Image(painter = painterResource(id = R.drawable.cleaning), contentDescription = "")

            Spacer(modifier = Modifier.height(32.dp))

            Text(text = "Cleaning on Demand",
                style = MaterialTheme.typography.h6,
                fontWeight = FontWeight.Bold
            )

            Spacer(modifier = Modifier.height(12.dp))


            Text(text = "Book an Appointment in less than 60 seconds and get on the schedule as early as tomorrow",
                style = MaterialTheme.typography.caption, textAlign = TextAlign.Center)
        }
    }
}