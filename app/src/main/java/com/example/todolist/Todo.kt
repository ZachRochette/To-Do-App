package com.example.todolist

//Populate the views with data and pass the list of items to the todoadapter class
data class Todo (
    val title: String,
    var isChecked: Boolean = false
        )