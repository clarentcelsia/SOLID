package com.example.solid.S.After

class Util {

    companion object {
        private const val currentYear = 2021
        fun calculateAge(birthYear: Int): Int {
            return currentYear - birthYear
        }
    }
}