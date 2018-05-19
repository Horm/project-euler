package problem1

fun calculateNaturalMultiplesSum(multiples: List<Int>, limit: Int): Int {
    return getMultipleOfNumbersUnder(multiples, limit).sum()
}

fun getNaturalNumbers(count: Int): List<Int> {
    return (0 until count).map { it + 1 }
}

fun isNumberMultipleOf(number: Int, multiplier: Int): Boolean {
    return number % multiplier == 0
}

fun isNumberMultipleOf(number: Int, multipliers: List<Int>): Boolean {
    multipliers.forEach { if (isNumberMultipleOf(number, it)) return true }
    return false
}

fun getMultipleOfNumbersUnder(multiples: List<Int>, limit: Int): List<Int> {
    return getNaturalNumbers(limit - 1).filter { isNumberMultipleOf(it, multiples) }
}