package PracticeTest

fun main() {

    fizzBuzz(15)
}

fun fizzBuzz(n: Int): Unit {

    for (i in 1..n) {
        println(
            when {
                (i % 15 == 0) -> "FizzBuzz"
                (i % 3 == 0) -> "Fizz"
                (i % 5 == 0) -> "Buzz"
                else -> i
            }

        )
    }
}