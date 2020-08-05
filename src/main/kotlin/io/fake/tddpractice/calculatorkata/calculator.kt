package io.fake.tddpractice.calculatorkata

fun addNumbers(numbers: String): Int {
    val customDelimiter = """(//.+?\n).+""".toRegex(RegexOption.MULTILINE)
    val numArray = when {
        customDelimiter.matches(numbers) -> {
            val customDelimiterPrefix = customDelimiter.find(numbers)?.groupValues?.get(1)
            val delimiter = customDelimiterPrefix?.removePrefix("//")?.removeSuffix("\n")
            numbers.removePrefix(customDelimiterPrefix!!).split(delimiter!!)
        }
        else -> numbers.split(",").map { s -> s.split("\n") }.flatten()
    }
    return when {
        numArray.size == 1 && numArray[0] == "" -> 0
        numArray.size == 1 -> numArray[0].toInt()
        numArray.size >= 2 -> numArray.sumBy { s -> s.toInt() }
        else -> 0
    }
}