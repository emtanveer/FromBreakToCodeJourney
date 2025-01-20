package Miscellaneous

import java.util.*
import kotlin.collections.ArrayList

fun main(args: Array<String>) {
    //Number steps
    //Problems().numberSteps(0, 8, 2)

    //Fibonacci Sequence
    //Problems().fibonacci()

    //Consistent capitalization
    //Problems().capitalization("sad", "upper")
    //println("This is a problem".capitalizeWords())

    //The longest word
    //Problems().findLongestWord()

    //Caesar cipher
    //val cipher: String = Problems().encodeCaesarCipher("bcd", 1)
    //println("Cipher Text: $cipher")

    //Train route
    //val routes = arrayListOf<String>("NY Penn")
    //val routes = arrayListOf<String>("NY Penn", "Woodside", "Forest Hills")
    //val trainDetails = arrayListOf<Any>(234, "10:00", "Montauk")
    //Problems().trainRoute(routes, trainDetails)

    //Permutation palindrome
    //Problems().palindrome("wah")

    //FizzBuzz
    //Problems().fizzbuzz(20)

    //Steps
    //Problems().steps(5,"a")

    //Triangle
    //Problems().triangle(3)

    //Factorial
    //var totalResultant = Problems().factorialWithRecursion(5)
    var totalResultant = Problems().factorial(5)
    println(totalResultant)

    //String to Int
    //print(Problems().shouldReturnIntFromString("23"))
    //print(Problems().convert("2355"))

}

public class Problems {

    //Number steps
    fun numberSteps(initialValue: Int, maxValue: Int, stepValue: Int) {
        for (i in initialValue..maxValue step stepValue) {
            if (i != 0) {
                println(i)
            }
        }
    }

    //Fibonacci series
    fun fibonacci() {
        val nthTerm = 10
        var currentIndex = 0
        var nextIndex = currentIndex + 1

        print("first $nthTerm terms: ")

        for (i in 0..nthTerm) {
            print(" $currentIndex +")
            val sum = currentIndex + nextIndex
            currentIndex = nextIndex
            nextIndex = sum
        }
    }

    //Consistent capitalization
    fun capitalization(input: String, case: String) {
        when (case) {
            "upper" -> {
                println(input.uppercase(Locale.getDefault()))
            }
            "lower" -> {
                println(input.lowercase(Locale.getDefault()))
            }
            /*
             To give yourself an added challenge,
             add the arguments "snake" and "camel" that convert a string
             of words separated by spaces into snake case or camel case.

             thisissnake_case

             ThisIsCamelCase
             */
            "snake" -> {
            }
            "camel" -> {
            }
            else -> {
            }
        }
    }

    //The longest word
    fun findLongestWord() {
        val sentence = "I love Codecademy,"
        val tempArray: ArrayList<String> = arrayListOf()
        var longestString = ""

        sentence.split(" ").map {
            tempArray.add(it)
            //println(it)
        }.forEachIndexed { index, b ->
            if ((index + 1) != tempArray.size) {
                if (tempArray[index].length > tempArray[index + 1].length) {
                    longestString = tempArray[index]
                } else if (tempArray[index].length < tempArray[index + 1].length) {
                    longestString = tempArray[index + 1]
                } else if (tempArray[index].length == tempArray[index + 1].length) {
                    longestString = tempArray[index]
                }
            }
        }
        //Via Loop
        /*   for (index in 0 until tempArray.size) {
               if ((index + 1) != tempArray.size) {
                   if (tempArray[index].length > tempArray[index + 1].length) {
                       longestString = tempArray[index]
                   } else if (tempArray[index].length < tempArray[index + 1].length) {
                       longestString = tempArray[index + 1]
                   } else if (tempArray[index].length == tempArray[index + 1].length) {
                       longestString = tempArray[index]
                   }
               }
           }*/
        println("word: $longestString count: ${longestString.length}.")
    }

    //Caesar cipher
    fun encodeCaesarCipher(input: String, numberOfShifts: Int): String {
        val aToz = ('a'..'z').toSet()

        var shiftedResult = input

        (1..numberOfShifts).forEach { _ ->
            shiftedResult = shiftedResult.drop(1)
            val indexOf = aToz.indexOf(shiftedResult.last())
            shiftedResult = shiftedResult.plus(aToz.elementAt(indexOf + 1))
        }

        return shiftedResult
    }

    //Train route
    fun trainRoute(stations: ArrayList<String>, trainDetails: ArrayList<Any>) {
        if (stations.size > 1) {
            print("${trainDetails[1]} train number ${trainDetails[0]} to  ${trainDetails[2]} is stopping at ")
            // print("Train is stopping at " )
            for (i in 0 until stations.size) {
                if (i != stations.size - 1) {
                    print("${stations[i]},")
                } else {
                    print(" and ${stations[i]}.")
                }
            }
        } else {
            println("Train is stopping at ${stations[0]}")
        }
    }

    //Permutation palindrome
    fun palindrome(input: String) {
        var result = ""

        //var abc = input.split(" ")
//        input.split(" ").map {
//            result = if(it.reversed() == it){
//                "TRUE"
//            } else{
//                "FALSE"
//            }
//        }

        val clearedInput = input.replace(" ", "")
        result = if (clearedInput.reversed().contentEquals(clearedInput)) {
            "TRUE"
        } else {
            "FALSE"
        }
        println(result)

    }

    //FizzBuzz
    fun fizzbuzz(input: Int) {
        for (i in 1..input) {
            if (i % 3 == 0) {
                println(i.toString().replace(i.toString(), "Fizz"))
                if (i % 5 == 0) {
                    println(i.toString().replace(i.toString(), "FizzBuzz"))
                }
            } else if (i % 5 == 0) {
                println(i.toString().replace(i.toString(), "Buzz"))
            } else {
                println(i)
            }

        }
    }

    //Steps
    fun steps(input: Int, char: String) {
        for (i in 1..input)
            print(char)
    }

    //Triangle
    fun triangle(rows: Int) {
        var k = 0

        for (i in 1..rows) {
            for (space in 1..rows - i) {
                print("  ")
            }

            while (k != 2 * i - 1) {
                print("* ")
                ++k
            }

            println()
            k = 0
        }
    }

    //Factorial
    fun factorialWithRecursion(input: Int): Long {
        if (input >= 1) {
            return input * factorialWithRecursion(input - 1)
        } else {
            return 1
        }
    }

    //Factorial with Recursion
    fun factorial(input: Int): Long {
        var factorial: Long = 1

        for (i in 1..input) {
            factorial *= i
        }

        return factorial
    }


    //Convert String to Int without using built-in function
    fun shouldReturnIntFromString(value: String): Int {
        var result = 0

        for (i in 0 until value.length) {

            //0-9  48-57         2=> 50    , 3= 51
            val valueConverted = value[i]

            // Subtract 48 from the current digit
            result = result * 10 + (valueConverted.toInt() - 48)
        }
        return result
    }

    fun convert(strNum: String): Int {
//    Convert srtNum to char
//    for each char (represented as 'b') -> 'b' -'0' will give the relative number
//    sum all in a (initial value is 0) (each time we perform an operation on a char do -> a=a*10
        val result = strNum.chars().reduce(0) { a: Int, b: Int ->
            10 * a + b - 48 // 48 is the Ascii code of 0
        }
        return result
    }


}


