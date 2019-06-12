package problem3

import org.junit.Assert.assertTrue
import org.junit.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse

class LargestPrimeFactorCalculatorTest {

    @Test
    fun isPrimeNumber() {
        assertTrue(isPrimeNumber(5))
        assertFalse(isPrimeNumber(4))
    }

    @Test
    fun getFactors() {
        assertEquals(listOf<Long>(2, 3, 6), getFactors(6))
        assertEquals(listOf<Long>(2, 3, 4, 6, 12), getFactors(12))
    }

    @Test
    fun getPrimeFactors() {
        assertEquals(listOf<Long>(2, 3), getPrimeFactors(6))
        assertEquals(listOf<Long>(2, 7), getPrimeFactors(14))
        assertEquals(listOf<Long>(2, 2, 2, 3), getPrimeFactors(24))
    }

    @Test
    fun getLargestPrimeFactor() {
        assertEquals(29, getLargestPrimeFactor(13195))
        //assertEquals(29, getLargestPrimeFactor(600851475143))
    }
}