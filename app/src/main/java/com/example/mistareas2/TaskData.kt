package com.example.mistareas2

data class Task(
    val id: Int,
    val title: String,
    val description: String,
    var isCompleted: Boolean = false
)

object TaskData {
    val tasks = mutableListOf<Task>()
}
