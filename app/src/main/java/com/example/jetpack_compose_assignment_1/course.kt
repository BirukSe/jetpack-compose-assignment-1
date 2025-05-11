// Course.kt
package com.example.jetpack_compose_assignment_1

data class Course(
    val id: Int,
    val title: String,
    val code: String,
    val creditHours: Int,
    val description: String,
    val prerequisites: String
)

object CourseRepository {
    val courses = listOf(
        Course(
            id = 1,
            title = "Introduction to Computer Science",
            code = "CS101",
            creditHours = 3,
            description = "Fundamental concepts of computer science including problem solving, algorithms, abstraction, and software design.",
            prerequisites = "None"
        ),
        Course(
            id = 2,
            title = "Data Structures",
            code = "CS201",
            creditHours = 4,
            description = "Study of fundamental data structures including arrays, linked lists, stacks, queues, trees, and graphs.",
            prerequisites = "CS101"
        ),
        Course(
            id = 3,
            title = "Algorithms",
            code = "CS301",
            creditHours = 4,
            description = "Design and analysis of algorithms, including sorting, searching, graph algorithms, and complexity analysis.",
            prerequisites = "CS201"
        ),
        Course(
            id = 4,
            title = "Database Systems",
            code = "CS401",
            creditHours = 3,
            description = "Introduction to database systems, including data modeling, SQL, relational database design, and transaction processing.",
            prerequisites = "CS201"
        ),
        Course(
            id = 5,
            title = "Operating Systems",
            code = "CS402",
            creditHours = 4,
            description = "Principles of operating systems including process management, memory management, file systems, and concurrency.",
            prerequisites = "CS301"
        ),
        Course(
            id = 6,
            title = "Computer Networks",
            code = "CS403",
            creditHours = 3,
            description = "Introduction to computer networks, including protocol layers, routing, transport protocols, and network applications.",
            prerequisites = "CS301"
        ),
        Course(
            id = 7,
            title = "Artificial Intelligence",
            code = "CS501",
            creditHours = 4,
            description = "Introduction to artificial intelligence including search, knowledge representation, machine learning, and neural networks.",
            prerequisites = "CS301"
        ),
        Course(
            id = 8,
            title = "Software Engineering",
            code = "CS502",
            creditHours = 3,
            description = "Principles of software engineering including requirements analysis, design, implementation, testing, and maintenance.",
            prerequisites = "CS301"
        )
    )
}