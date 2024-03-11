package com.example.todo.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.todo.ui.theme.TodoTheme

@Composable
fun WelcomeComponent(){
    Column(
        verticalArrangement = Arrangement.SpaceEvenly
    ){
        Text(
            text = "Hi, Murira",
            fontFamily = FontFamily.Monospace,
            fontSize = 22.sp
        )
        Text(
            text = "Twelve tasks for today",
            fontFamily = FontFamily.Serif,
            fontSize = 18.sp, color = Color.LightGray
        )
    }
}
@Preview
@Composable
fun WelcomeComponentPreview(){
    TodoTheme {
        WelcomeComponent()
    }
}