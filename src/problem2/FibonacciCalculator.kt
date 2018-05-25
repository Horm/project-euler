package problem2

fun getFibonacciNumbers(limit: Int): List<Int> {
    val startingTerms = mutableListOf(1, 2)

    while (startingTerms.last() < limit) startingTerms += startingTerms[startingTerms.lastIndex] + startingTerms[startingTerms.lastIndex - 1]

    return startingTerms.filter { it <= limit }
}

fun isEvenNumber(number: Int) : Boolean {
    return number % 2 == 0
}

fun getEvenFibonacciSum(limit: Int): Int {
    return getFibonacciNumbers(limit).filter { isEvenNumber(it) }.sum()
}