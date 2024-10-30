package com.example.mistareas2

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import kotlin.random.Random

class TaskRegisterActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TaskRegisterScreen { task ->
                // Guardar la tarea en alguna lista global o ViewModel
                TaskData.tasks.add(task)
                // Navegar a Listado de Tareas
                val intent = Intent(this, TaskListActivity::class.java)
                startActivity(intent)
                finish()
            }
        }
    }
}

@Composable
fun TaskRegisterScreen(onTaskRegistered: (Task) -> Unit) {
    var title by remember { mutableStateOf("") }
    var description by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        TextField(
            value = title,
            onValueChange = { title = it },
            label = { Text("Título de la tarea") }
        )
        Spacer(modifier = Modifier.height(8.dp))
        TextField(
            value = description,
            onValueChange = { description = it },
            label = { Text("Descripción") }
        )
        Spacer(modifier = Modifier.height(16.dp))
        Button(
            onClick = {
                val newTask = Task(id = generateTaskId(), title = title, description = description)
                onTaskRegistered(newTask)
            }
        ) {
            Text("Registrar Tarea")
        }
    }
}

fun generateTaskId(): Int = Random.nextInt(0, 10000)
