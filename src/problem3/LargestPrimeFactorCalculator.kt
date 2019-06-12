package problem3

fun isPrimeNumber(number: Long): Boolean {
    val factors = getFactors(number)
    return factors.size == 1 && factors.contains(number)
}

fun getFactors(number: Long): List<Long> {
    return (2..number).filter { isDividableBy(number, it) }
}

private fun isDividableBy(restAfterDivision: Long, possibleFactor: Long) = (restAfterDivision % possibleFactor) == 0.toLong()

fun getLargestPrimeFactor(number: Long): Long {
   return getPrimeFactors(number).last()
}

fun isPrimeNumber(number: Long, factors: List<Long>): Boolean {
    return factors.size == 1 && factors.contains(number)
}

fun getPrimeFactors(number: Long): List<Long> {
    val factors = mutableListOf<Long>()
    var restAfterDivision = number
    (2..number).forEach { possibleFactor ->

        while (isDividableBy(restAfterDivision, possibleFactor)) {

            factors.add(possibleFactor)
            restAfterDivision = restAfterDivision.div(possibleFactor)
        }
    }

    return factors.toList()
}
