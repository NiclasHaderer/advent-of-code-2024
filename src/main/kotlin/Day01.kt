package com.advent

import kotlin.math.abs

object Day01 {
    fun part1(
        list1: List<Int>,
        list2: List<Int>,
    ): Int {
        val sorted1 = list1.sorted()
        val sorted2 = list2.sorted()

        return sorted1.zip(sorted2).sumOf { (a, b) ->
            abs(a - b)
        }
    }

    fun part2(
        list1: List<Int>,
        list2: List<Int>,
    ): Int {
        val list2Count = list2.groupingBy { it }.eachCount()

        return list1.sumOf {
            it * list2Count.getOrDefault(it, 0)
        }
    }
}
