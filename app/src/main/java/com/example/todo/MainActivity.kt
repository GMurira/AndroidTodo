package com.example.todo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.todo.components.ProfileHeaderComponent
import com.example.todo.components.WelcomeComponent
import com.example.todo.ui.theme.TodoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LazyColumn(
                modifier = Modifier.padding(start = 16.dp, top = 16.dp, bottom = 16.dp)
            ){
                item{
                    ProfileHeaderComponent()
                }
                item{
                    Spacer(modifier = Modifier.height(30.dp))
                    WelcomeComponent()

                    Spacer(modifier = Modifier.height(30.dp))
                }
            }
        }
    }
}