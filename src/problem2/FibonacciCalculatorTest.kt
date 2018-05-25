package problem2


import kotlin.test.*
import org.junit.Test

class FibonacciCalculatorTest {

    @Test
    fun getFibonacciNumbers() {
        assertEquals(listOf(), getFibonacciNumbers(0))
        assertEquals(listOf(1), getFibonacciNumbers(1))
        assertEquals(listOf(1, 2, 3, 5), getFibonacciNumbers(6))
        assertEquals(listOf(1, 2, 3, 5, 8, 13, 21, 34, 55, 89), getFibonacciNumbers(90))

    }

    @Test
    fun isEvenNumber() {
        assertFalse(isEvenNumber(1))
        assertFalse(isEvenNumber(3))
        assertFalse(isEvenNumber(9))
        assertTrue(isEvenNumber(0))
        assertTrue(isEvenNumber(2))
        assertTrue(isEvenNumber(50))
    }

    @Test
    fun getEvenFibonacciSum() {
        assertEquals(10, getEvenFibonacciSum(8))
    }

    @Test
    fun calculateProblem() {
        assertEquals(4613732, getEvenFibonacciSum( 4000000))
    }



}
