package com.example.todo.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.todo.ui.theme.LightPurple
import com.example.todo.ui.theme.TodoTheme

@Composable
fun TaskComponent(modifier: Modifier = Modifier){
    Row(
        modifier = Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = "10:00\nAM",
            fontFamily = FontFamily.Monospace,
            textAlign = TextAlign.Center
        )

        Row (
            verticalAlignment = Alignment.CenterVertically
        ){
            Box(modifier = Modifier
                .size(16.dp)
                .clip(CircleShape)
                .border(
                    border = BorderStroke(3.dp, Color.Black),
                    shape = CircleShape
                )
            )
            Divider(modifier = Modifier.width(6.dp), color = Color.Black)

            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ){
                Column(
                    modifier = Modifier
                        .clip(RoundedCornerShape(14.dp))
                        .background(LightPurple)
                        .weight(0.9f),
                    verticalArrangement = Arrangement.SpaceBetween
                )
                {
                    Text(
                        text = "Take Lunch",
                        fontFamily = FontFamily.Monospace,
                        modifier = Modifier.padding(top = 12.dp, start = 12.dp)
                    )
                    Text(
                        text = "Cook Lunch after school",
                        fontFamily = FontFamily.Monospace,
                        modifier = Modifier.padding(start = 12.dp),
                        color = Color.LightGray
                    )
                    Text(
                        text = "8:00AM - 9:00AM",
                        fontFamily = FontFamily.Monospace,
                        modifier = Modifier.padding(top = 12.dp, start = 12.dp)
                    )
                }
                Divider(
                    modifier = Modifier
                        .width(6.dp)
                        .weight(0.1f),
                    color  = Color.Black
                )
            }
        }
    }
}
@Preview(showBackground = true)
@Composable
fun TaskComponentPreview(){
    TodoTheme {
        TaskComponent()
    }
}