package problem1

import kotlin.test.*
import org.junit.Test

class MultiplesCalculatorTest {


    @Test
    fun getNaturalNumbers() {
        assertEquals(listOf<Int>(), getNaturalNumbers(0))
        assertEquals(listOf(1), getNaturalNumbers(1))
        assertEquals(listOf(1, 2, 3, 4, 5, 6), getNaturalNumbers(6))
    }

    @Test
    fun isNumberMultipleOf() {
        assertTrue(isNumberMultipleOf(1, 1))
        assertTrue(isNumberMultipleOf(987, 1))
        assertTrue(isNumberMultipleOf(42, 2))
        assertTrue(isNumberMultipleOf(6, 2))
        assertTrue(isNumberMultipleOf(6, 3))
        assertTrue(isNumberMultipleOf(6, listOf(3, 2)))
        assertTrue(isNumberMultipleOf(6, listOf(3, 5)))
        assertTrue(isNumberMultipleOf(9, 3))
        assertFalse(isNumberMultipleOf(9, 2))

    }


    @Test
    fun getMultipleOfNumbersUnder() {
        assertEquals(listOf(3, 5, 6, 9), getMultipleOfNumbersUnder(listOf(3, 5), 10))
    }

    @Test
    fun calculateNaturalMultiplesSum() {
        assertEquals(23, calculateNaturalMultiplesSum(listOf(3, 5), 10))
        assertEquals(233168, calculateNaturalMultiplesSum(listOf(3, 5), 1000))
    }
}