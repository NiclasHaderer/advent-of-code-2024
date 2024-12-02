package utils

import java.io.File

open class BaseTest(
    private val year: Int,
    private val day: Int
) {
    val inputFile = File("src/inputs/puzzle_${day.toString().padStart(2, '0')}.txt")

    init {
        if (!inputFile.exists()) {
            val content = AocClient.input(year, day)
            inputFile.writeText(content)
        }
    }

    fun getTwoIntColumns(): Pair<List<Int>, List<Int>> {
        val regex = Regex("""(\d+) +(\d+)""")
        val content = inputFile.readText()
        val (a, b) = content.lines()
            .filter { it.isNotBlank() }
            .map { line ->
                val (first, second) = regex.find(line)!!.destructured
                first.toInt() to second.toInt()
            }.unzip()
        return a to b
    }

    fun getIntRows(): List<List<Int>> {
        val content = inputFile.readText()
        return content.lines()
            .filter { it.isNotBlank() }
            .map { line -> line.split(" ").map { it.toInt() } }
    }

    fun submitInt(level: Int, value: Int) {
        AocClient.submit(year, day, level, value)
    }

}