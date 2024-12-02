package com.advent

import kotlin.math.abs

object Day02 {
    fun part1(input: List<List<Int>>): Int {
        return input.count { ints ->
            var diff: Int? = null;

            for (i in 0 until ints.size - 1) {
                val newDiff = ints[i] - ints[i + 1]
                if (abs(newDiff) > 3) return@count false;

                val sameSignedness = diff?.let {
                    (it > 0 && newDiff > 0) || (it < 0 && newDiff < 0)
                } ?: true

                if (!sameSignedness) return@count false;
                diff = newDiff
            }
            true
        }
    }

    fun part2(input: List<List<Int>>): Int  = input.count { ints ->
        // ints.windowed()
        true
    }
}