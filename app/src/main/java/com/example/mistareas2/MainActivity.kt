package com.example.mistareas2

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.mistareas2.ui.theme.Mistareas2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Mistareas2Theme {
                Scaffold(
                    modifier = Modifier.fillMaxSize()
                ) { innerPadding ->
                    MainScreen(
                        modifier = Modifier.padding(innerPadding),
                        navigateToTaskRegister = { navigateToTaskRegister(this) },
                        navigateToTaskList = { navigateToTaskList(this) }
                    )
                }
            }
        }
    }

    private fun navigateToTaskRegister(context: Context) {
        val intent = Intent(context, TaskRegisterActivity::class.java)
        context.startActivity(intent)
    }

    private fun navigateToTaskList(context: Context) {
        val intent = Intent(context, TaskListActivity::class.java)
        context.startActivity(intent)
    }
}

@Composable
fun MainScreen(
    modifier: Modifier = Modifier,
    navigateToTaskRegister: () -> Unit,
    navigateToTaskList: () -> Unit
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Bienvenido a MisTareas2")

        Spacer(modifier = Modifier.height(16.dp))

        Button(
            onClick = navigateToTaskRegister,
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Registrar Nueva Tarea")
        }

        Spacer(modifier = Modifier.height(8.dp))

        Button(
            onClick = navigateToTaskList,
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Ver Lista de Tareas")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun MainScreenPreview() {
    Mistareas2Theme {
        MainScreen(
            navigateToTaskRegister = {},
            navigateToTaskList = {}
        )
    }
}
