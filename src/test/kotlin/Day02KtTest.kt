import com.advent.Day02
import org.junit.jupiter.api.Test
import utils.BaseTest

class Day02KtTest : BaseTest(2024, 2) {
    private val a = listOf(
        listOf(7, 6, 4, 2, 1),
        listOf(1, 2, 7, 8, 9),
        listOf(9, 7, 6, 2, 1),
        listOf(1, 3, 2, 4, 5),
        listOf(8, 6, 4, 4, 1),
        listOf(1, 3, 6, 7, 9),
    )

    @Test
    fun part1() {
        val result = Day02.part1(a)
        assert(result == 2)
    }

    @Test
    fun part1Real() {
        val rows = getIntRows()
        val result = Day02.part1(rows)
        assert(result == 486)
    }


    @Test
    fun part2() {
        val result = Day02.part2(a)
        assert(result == 4)
    }

    @Test
    fun historianHysteriaSimilarityReal() {
    }
}