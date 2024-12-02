import com.advent.Day01
import org.junit.jupiter.api.Test
import utils.BaseTest

class Day01KtTest : BaseTest(2024, 1) {
    private val a = listOf(3, 4, 2, 1, 3, 3)
    private val b = listOf(4, 3, 5, 3, 9, 3)

    @Test
    fun part1() {
        val result = Day01.part1(a, b)
        assert(result == 11)
    }

    @Test
    fun part1Real() {
        val (a, b) = getTwoIntColumns()
        val result = Day01.part1(a, b)
        assert(result == 2264607)
    }


    @Test
    fun part2() {
        val result = Day01.part2(a, b)
        assert(result == 31)
    }

    @Test
    fun part2Real() {
        val (a, b) = getTwoIntColumns()
        val result = Day01.part2(a, b)
        assert(result == 19457120)
    }
}