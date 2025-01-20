package Miscellaneous

import java.util.*

fun main() {

//    val arr = arrayListOf<Int>(-4, 3, -9, 0, 4, 1)
//    plusMinus(arr.toTypedArray())

//        val s = "12:01:00AM"
//      val s = "07:05:45PM"
//      println(timeConversion(s))

//    val strings = arrayOf("ab", "ab", "abc")
//    val queries = arrayOf("ab", "abc", "bc")
//
//    val result = matchingStrings(strings, queries)
//    result.forEach {
//        print("$it ")
//    }

//    val arr: Array<Array<Int>> = arrayOf(
//        arrayOf(1, 2, 3),
//        arrayOf(4, 5, 6),
//        arrayOf(9, 8, 9),
//    )
//    println(diagonalDifference(arr))

}

fun plusMinus(arr: Array<Int>): Unit {
    val totalArraySize: Float = arr.size.toFloat()

    var numbersOfZero = 0f
    var numbersOfPositive = 0f
    var numbersOfNegative = 0f

    for (i in 0..arr.lastIndex) {
        val element = arr[i]
        if (element > 0) {
            numbersOfPositive += 1
        } else if (element < 0) {
            numbersOfNegative += 1
        } else if (element == 0) {
            numbersOfZero += 1
        }
    }

    println("%.6f".format(numbersOfPositive / totalArraySize))
    println("%.6f".format(numbersOfNegative / totalArraySize))
    println("%.6f".format(numbersOfZero / totalArraySize))

}

fun timeConversion(s: String): String {
    var finalTime = ""
    //get hour of the input time
    val hour = s.substring(0, 2).toInt()
    //check whether we getting AM or PM
    val convention = s.substring(s.length - 2, s.length)

    // upon receiving AM, subtract current hour to 12


    // special case where if hour is 12 and its AM -> make it 00 hour
    if (hour == 12 && convention.lowercase(Locale.getDefault()) == "am") {
        finalTime = "00" + s.substring(2, s.length - 2)
    }
    // upon receiving PM, add current hour to 12,
    else if (hour < 12 && convention.lowercase(Locale.getDefault()) == "pm") {
        finalTime = (12 + hour).toString() + "" + s.substring(2, s.length - 2)
    } else {
        finalTime = s.substring(0, s.length - 2)
    }

    return finalTime

}

fun matchingStrings(strings: Array<String>, queries: Array<String>): Array<Int> {
//    val resultantArray = arrayListOf<Int>()
//
//    for (i in 0..queries.lastIndex) {
//        var count = 0
//        for (j in 0..strings.lastIndex) {
//            if (queries[i] == strings[j]) {
//                count++
//            }
//        }
//        resultantArray.add(count)
//    }
//
//    return resultantArray.toTypedArray()

    val resultantArray = arrayListOf<Int>()

    val map = strings.groupingBy { it }.eachCount()
    return queries.map { map[it] ?: 0 }.toTypedArray()
}

fun diagonalDifference(arr: Array<Array<Int>>): Int {
    var leftToRightDiagonalSum = 0
    var rightToLeftDiagonalSum = 0

    //left to right sum
    for (i in arr.indices) {
        for (j in 0 until arr[i].size) {
            if (i == j)
                leftToRightDiagonalSum += arr[i][j]
        }
    }

    //right to left sum
    var rightIdx = arr[0].lastIndex
    for (i in arr.indices) {
        rightToLeftDiagonalSum += arr[i][rightIdx]
        rightIdx -= 1
    }

    println(rightToLeftDiagonalSum)
    return -1
}

//fun longestSubstringWithoutRepeatingCharacters(string: String): Int {
//
//}
