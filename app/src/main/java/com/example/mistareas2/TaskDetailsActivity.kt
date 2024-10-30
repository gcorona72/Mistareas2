package com.example.mistareas2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

class TaskDetailsActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val taskId = intent.getIntExtra("TASK_ID", -1)
        val task = TaskData.tasks.find { it.id == taskId }

        setContent {
            task?.let {
                TaskDetailsScreen(
                    task = it,
                    onTaskCompleted = {
                        it.isCompleted = true
                        finish()
                    },
                    onTaskDeleted = {
                        TaskData.tasks.remove(it)
                        finish()
                    }
                )
            }
        }
    }
}

@Composable
fun TaskDetailsScreen(task: Task, onTaskCompleted: () -> Unit, onTaskDeleted: () -> Unit) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(task.title, style = MaterialTheme.typography.headlineMedium)
        Text(task.description, style = MaterialTheme.typography.bodyLarge)
        Spacer(modifier = Modifier.height(16.dp))

        Button(onClick = { onTaskCompleted() }) {
            Text("Marcar como Completada")
        }

        Spacer(modifier = Modifier.height(8.dp))

        Button(onClick = { onTaskDeleted() }) {
            Text("Eliminar Tarea")
        }
    }
}
