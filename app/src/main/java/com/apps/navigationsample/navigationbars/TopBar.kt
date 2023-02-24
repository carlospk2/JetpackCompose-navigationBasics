package com.apps.navigationsample.navigationbars

import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch
import com.apps.navigationsample.R

@Composable
fun TopBar(
    scope: CoroutineScope,
    scaffoldState: ScaffoldState
) {
    TopAppBar(
        title = { Text(LocalContext.current.getString(R.string.app_name)) },
        navigationIcon = {
            IconButton(onClick = {
                scope.launch {
                    scaffoldState.drawerState.open()
                }
            }) {
                Icon(imageVector = Icons.Filled.Menu, contentDescription = "Menu Icon")
            }
        },
        actions = {
            IconButton(onClick = {
                // TODO: Display SnackBar
            }) {
                Icon(imageVector = Icons.Default.Search, contentDescription = "Search Icon")
            }

            IconButton(onClick = {
                // TODO: Display Dialog
            }) {
                Icon(imageVector = Icons.Default.Search, contentDescription = "Search Icon")
            }
        }
    )
}