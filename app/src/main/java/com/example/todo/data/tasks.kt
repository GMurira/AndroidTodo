package com.example.todo.data

data class Task(
    val id: Int,
    val title: String,
    val body: String? = null,
    val startTime: String,
    val endTime: String
)

val taskList = listOf(
    Task(
        1,
        "Do laundry",
        "Wash and fold clothes",
        "10:00",
        "11:10"
    ),
    Task(
        2,
        "Do the dishes",
        "Wash the utensils",
        "11:30",
        "12:30"

    ),
    Task(
        3,
        "Read a book",
        "Revise the book",
        "13:00",
        "14:00"

    ),
    Task(
        4,
        "Do laundry",
        "Wash and fold clothes",
        "10:00",
        "11:10"
    ),
    Task(
        5,
        "Do the dishes",
        "Wash the utensils",
        "11:30",
        "12:30"

    ),
    Task(
        6,
        "Read a book",
        "Revise the book",
        "13:00",
        "14:00"

    ), Task(
        7,
        "Do laundry",
        "Wash and fold clothes",
        "10:00",
        "11:10"
    ),
    Task(
        8,
        "Do the dishes",
        "Wash the utensils",
        "11:30",
        "12:30"

    ),
    Task(
        9,
        "Read a book",
        "Revise the book",
        "13:00",
        "14:00"

    ), Task(
        10,
        "Do laundry",
        "Wash and fold clothes",
        "10:00",
        "11:10"
    ),
    Task(
        11,
        "Do the dishes",
        "Wash the utensils",
        "11:30",
        "12:30"

    ),
    Task(
        12,
        "Read a book",
        "Revise the book",
        "13:00",
        "14:00"

    )
)