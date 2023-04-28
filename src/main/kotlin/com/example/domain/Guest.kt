package com.example.domain

data class Guest(
    val id: Int,
    val firstName: String,
    val lastName: String,
    val reservation: Reservation
)

data class Reservation(
    val roomNumber: Int,
    val startTimestamp: Int,
    val endTimestamp: Int
)