import com.advent.historianHysteria
import com.advent.historianHysteriaSimilarity
import com.advent.utils.readInput
import org.junit.jupiter.api.Test

class Day01KtTest {
    private val a = listOf(3, 4, 2, 1, 3, 3)
    private val b = listOf(4, 3, 5, 3, 9, 3)

    @Test
    fun historianHysteria() {
        val result = historianHysteria(a, b)
        assert(result == 11)
    }


    @Test
    fun historianHysteriaReal() {
        val (a, b) = readInput("/puzzle_01.txt")
        val result = historianHysteria(a, b)
        assert(result == 2264607)
    }


    @Test
    fun historianHysteriaSimilarity() {
        val result = historianHysteriaSimilarity(a, b)
        assert(result == 31)
    }

    @Test
    fun historianHysteriaSimilarityReal() {
        val (a, b) = readInput("/puzzle_01.txt")
        val result = historianHysteriaSimilarity(a, b) // 19457120
        assert(result == 19457120)
    }

}