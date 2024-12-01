package com.advent.utils


fun readInput(fileName: String): Pair<List<Int>, List<Int>> {
    val regex = Regex("""(\d+) +(\d+)""")
    val content = object {}.javaClass.getResource(fileName)!!.readText()
    val (a, b) = content.lines().map { line ->
        val (first, second) = regex.find(line)?.destructured ?: return@map null
        first.toInt() to second.toInt()
    }.filterNotNull().unzip()
    return a to b
}