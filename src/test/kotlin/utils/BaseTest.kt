package utils

import java.io.File

open class BaseTest(
    year: Int,
    day: Int
) {
    val inputFile = File("src/inputs/puzzle_${day.toString().padStart(2, '0')}.txt")

    init {
        if (!inputFile.exists()) {
            val content = AocClient.input(year, day)
            inputFile.writeText(content)
        }
    }

    fun getInput(): Pair<List<Int>, List<Int>> {
        val regex = Regex("""(\d+) +(\d+)""")
        val content = inputFile.readText()
        val (a, b) = content.lines().map { line ->
            val (first, second) = regex.find(line)?.destructured ?: return@map null
            first.toInt() to second.toInt()
        }.filterNotNull().unzip()
        return a to b
    }

}