package com.advent

object Day02 {

    private fun isSave(ints: List<Int>): Boolean {
        if (ints.size < 2) return true
        val diffs = ints.zipWithNext { a, b -> a - b }
        val isIncreasing = diffs.all { it in 1..3 }
        val isDecreasing = diffs.all { it in -3..-1 }

        return isIncreasing || isDecreasing
    }

    private fun withRemovedItemsIsSave(ints: List<Int>): Boolean = ints.indices.any { i ->
        // Is it quick? No. Is it late? Yes!
        ints.toMutableList().also { it.removeAt(i) }.let(::isSave)
    }

    fun part1(input: List<List<Int>>): Int = input.count(::isSave)

    fun part2(input: List<List<Int>>): Int = input.count { ints ->
        isSave(ints) || withRemovedItemsIsSave(ints)
    }

}