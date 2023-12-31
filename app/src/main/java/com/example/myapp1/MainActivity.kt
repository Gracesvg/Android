package com.example.myapp1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Home()

        }
    }
}
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Home(){
    var name by remember { mutableStateOf(TextFieldValue(""))    }
    var email by remember { mutableStateOf(TextFieldValue(""))    }
    var password by remember { mutableStateOf(TextFieldValue(""))    }
    Column(horizontalAlignment = Alignment.CenterHorizontally,
    verticalArrangement = Arrangement.Top,
    modifier = Modifier.fillMaxSize()){
        Text(text = "Welcome to Android Programming",
             color = Color.Magenta,
             fontFamily = FontFamily.Serif,
             fontSize = 20.sp)
        Text(text = "This is Gloria's first App",
             color = Color.Black
        )

        Divider()
        OutlinedTextField(
            value =name,
            label = { Text(text = "Name")},
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
            onValueChange = {
                name=it
            })

        OutlinedTextField(
            value =email,
            label ={ Text(text = "Email")},
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
            onValueChange ={
                email=it
            } )
        OutlinedTextField(
            value =password,
            label ={ Text(text = "Password")},
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
            onValueChange ={
                password=it
            } )
        Spacer(modifier = Modifier.height(10.dp))

        Button(onClick = { /*TODO*/ },
            colors = ButtonDefaults.buttonColors(Color.Red)) {
            Text(text = "Submit")



        }


    }


}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Home()

}