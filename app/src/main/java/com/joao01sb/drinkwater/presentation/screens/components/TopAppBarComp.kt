package com.joao01sb.drinkwater.presentation.screens.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.joao01sb.drinkwater.presentation.theme.DrinkWaterTheme


@Preview(showBackground = true)
@Composable
fun TopAppBarComp() {
    DrinkWaterTheme {
        TopAppBar(
            title = { Text(text = "Nivel de Hidratação", Modifier.fillMaxWidth(), textAlign = TextAlign.Center) },
            navigationIcon = {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Default.Menu, contentDescription = "Menu")
                }
            },
            actions = {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(
                        imageVector = Icons.Default.Notifications,
                        contentDescription = "Notification"
                    )
                }
            },
            elevation = 2.dp
        )
    }
}
