package Miscellaneous

import java.util.*
import kotlin.collections.ArrayList
import kotlin.collections.HashMap

import kotlin.math.abs


fun main() {

//region Arrays

    //region Easy Difficulty

    //region Two Numbers Sum
//    val array = mutableListOf<Int>(3, 5, -4, 8, 11, 1, -1, 6)
//    val targetSum = 10
//
//    println(twoNumberSum(array, targetSum))
    //endregion

    //region Validate Subsequence
////    val array = listOf<Int>(5, 1, 22, 25, 6, -1, 8, 10)
////    val sequence = listOf<Int>(1, 6, -1, 10)
//
//    val array = listOf<Int>(1, 1, 1, 1, 1)
//    val sequence = listOf<Int>(1, 1, 1)
//
////    val array = listOf<Int>(5, 1, 22, 25, 6, -1, 8, 10)
////    val sequence = listOf<Int>(5, 1, 22, 22, 25, 6, -1, 8, 10)
//
//    println(isValidSubsequence(array, sequence))
////    isValidSubsequence(array, sequence)
//
//    //endregion
//
//    //region Sorted Squared Array
//
//    sortedSquaredArray
    //endregion

    //region Sorted Squared Array
//    val array = listOf<Int>(1, 2, 3, 5, 6, 8, 9)
//    println(sortedSquaredArray(array))
    //endregion

    //region Tournament Winner
//    val competitions: List<List<String>> = listOf(
//        listOf("HTML", "C#"),
//        listOf("C#", "Python"),
//        listOf("Python", "HTML")
//    )
//    val results = listOf<Int>(0, 0, 1)
//
//    println(tournamentWinner(competitions, results))
    //endregion

    //region Non-Constructible Change
//    val coins: MutableList<Int> = mutableListOf(5, 7, 1, 1, 2, 3, 22)
//    println(nonConstructibleChange(coins))
    //endregion

    //region Transpose Matrix
////    val matrix: MutableList<MutableList<Int>> =
////        mutableListOf(
////            mutableListOf(1, 2),
////        )
//    val matrix: MutableList<MutableList<Int>> =
//        mutableListOf(
//            mutableListOf(1, 2),
//            mutableListOf(3, 4),
//            mutableListOf(5, 6),
//        )
//    println(transposeMatrix(matrix))

    //endregion

    //endregion

    //region Medium Difficulty

    //region Three Number Sum
//    val array: MutableList<Int> = mutableListOf(12, 3, 1, 2, -6, 5, -8, 6)
//    val targetSum = 0
//    println(threeNumberSum(array, targetSum))
    //endregion

    //region Smallest Difference
//    val arrayOne: MutableList<Int> = arrayListOf(-1, 5, 10, 20, 28, 3)
//    val arrayTwo: MutableList<Int> = arrayListOf(26, 134, 135, 15, 17)
//    println(smallestDifference(arrayOne, arrayTwo))
    //endregion

    //region Move Element To End
//    val array: MutableList<Int> = mutableListOf(2, 1, 2, 2, 2, 3, 4, 2)
//    val toMove = 2
//    println(moveElementToEnd(array, toMove))
    //endregion

    //region Monotonic Array
//    val array: List<Int> = listOf(-1, -5, -10, -1100, -1100, -1101, -1102, -9001)
//    println(isMonotonic(array))
    //endregion

    //region Spiral Traverse
//    val array: List<List<Int>> = listOf(
//        listOf(1, 2, 3, 4),
//        listOf(12, 13, 14, 5),
//        listOf(11, 16, 15, 6),
//        listOf(10, 9, 8, 7)
//    )
//    println(spiralTraverse(array))
    //endregion

    //region Longest Peak
//    val array: List<Int> = listOf(1, 2, 3, 3, 4, 0, 10, 6, 5, -1, -3, 2, 3)
//    println(longestPeak(array))

    //endregion

    //region Array Of Products
//    val array: List<Int> = listOf(5, 1, 4, 2)
////    val array: List<Int> = listOf(4,4)
//    val result = arrayOfProducts(array)
//
//    result.forEach {
//        print("$it ")
//    }
    //endregion

    //region First Duplicate Value
//    val array: MutableList<Int> = mutableListOf(2, 1, 5, 2, 3, 3, 4)
//    println(firstDuplicateValue(array))
    //endregion

    //region Merge Overlapping
//    val intervals: List<List<Int>> = listOf(
//        listOf(1, 2),
//        listOf(3, 5),
//        listOf(4, 7),
//        listOf(6, 8),
//        listOf(9, 10)
//    )
//    mergeOverlappingIntervals(intervals).forEach {
//        print(it)
//    }
    //endregion

    //region Best Seat
//    val seats: MutableList<Int> = arrayListOf(1, 0, 1, 0, 0, 0, 1)
//    println(bestSeat(seats))

    //endregion

    //region Zero Sum Sub-array
//    val nums: List<Int> = listOf(4, -3, 2, 4, -1, -5, 7)
//    println(zeroSumSubarray(nums))
    //endregion

    //region Missing Numbers
//    val nums = mutableListOf<Int>(1, 4, 3)
//    val resultant = missingNumbersMethod2(nums)
//    resultant.forEach {
//        print("$it ")
//    }
    //endregion

    //region Majority Element
//    val array: MutableList<Int> = mutableListOf(1, 2, 3, 2, 2, 1, 2)
//    println(majorityElement(array))
    //endregion

    //region Sweet and Savory
    //val dishes: MutableList<Int> = mutableListOf(-3, -5, 1, 7)
    //val target = 8

//    val dishes: MutableList<Int> = mutableListOf(-5, 10)
//    val target = 4

/*    val dishes: MutableList<Int> = mutableListOf(-12, 13, 100, -53, 540, -538, 53, 76, 32, -63)
    val target = 42

    val result = sweetAndSavory(dishes, target)
    result.forEach {
        print("$it ")
    }*/
    //endregion

    //endregion

    //region Hard Difficulty
    val array: MutableList<Int> = mutableListOf(7, 6, 4, -1, 1, 2)
    val targetSum = 16
    fourNumberSum(array, targetSum).forEach {
        print("$it, ")
    }

    //endregion

//endregion

}

//region Arrays

//region Easy Difficulty

//region Two Numbers Sum
fun twoNumberSum(array: MutableList<Int>, targetSum: Int): List<Int> {
    val map: HashMap<Int, Boolean> = HashMap()

    //region Solution 1
//    for (i in 0 until array.lastIndex) {
//        val element = array[i]
//        if (!map.containsKey(element)) {
//            map.put(element, true)
//        }
//    }
//
//    for (i in 0 until array.lastIndex) {
//        val element = array[i]
//
//        if (map.containsKey(targetSum - element)) {
//            map.keys.find {
//                it == targetSum - element
//            }?.let { mappedValue ->
//                if(mappedValue != element) {
//                    resultantList.add(mappedValue)
//                }
//            }
//        }
//    }
//
//    return if (resultantList.isNotEmpty()) {
//        resultantList
//    } else {
//        emptyList()
//    }
    //endregion

    //region Solution 2
    for (i in 0..array.lastIndex) {
        val resultant = targetSum - array[i]
        if (map.containsKey(resultant)) {
            //we found our result and return both value as an array
            val hashMapFoundValueKeyInMap = map.filterKeys {
                it == resultant
            }.keys.first()
            return listOf<Int>(array[i], hashMapFoundValueKeyInMap)
        } else {
            map.put(array[i], true)
        }
    }
    return listOf<Int>()
    //endregion
}
//endregion

//region Validate Subsequence
fun isValidSubsequence(array: List<Int>, sequence: List<Int>): Boolean {

    //region Solution 1
//    var count = 0
//    var sequenceIndex = 0
//    var arrayIndex = 0
//
//    while (sequenceIndex < sequence.size && arrayIndex < array.size) {
//        if (sequence[sequenceIndex] == array[arrayIndex]) {
//            count++
//            sequenceIndex++
//            arrayIndex++
//        } else {
//            arrayIndex++
//        }
//    }
//
//    return count == sequence.size
    //endregion

    //region Solution 2
    var sequenceIndex = 0

    for (i in 0..array.lastIndex) {
        if (sequenceIndex == sequence.size) {
            break
        }
        if (sequence[sequenceIndex] == array[i]) {
            sequenceIndex++
        }
    }

    return sequenceIndex == sequence.size
    //endregion
}
//endregion

//region Sorted Squared Array
fun sortedSquaredArray(array: List<Int>): List<Int> {
    //region Solution 1
//    val resultant = mutableListOf<Int>()
//
//    for (i in 0..array.lastIndex) {
//        val element = array[i]
//        resultant.add( element * element)
//    }
//    resultant.sorted()
//    return resultant
    //endregion

    //region Solution 2
    var startIndex = 0;
    var endIndex = array.size - 1

    val resultantArray = IntArray(array.size) { 0 }.toList().toMutableList()


    for (i in array.size - 1 downTo 0) {
        val smallestValue = array[startIndex]
        val largestValue = array[endIndex]

        if (abs(smallestValue) > abs(largestValue)) {
            resultantArray[i] = smallestValue * smallestValue
            startIndex++
        } else {
            resultantArray[i] = largestValue * largestValue
            endIndex--
        }
    }
    return resultantArray
    //endregion
}

//endregion

//region Tournament Winner
fun tournamentWinner(competitions: List<List<String>>, results: List<Int>): String {

//        [homeTeam, awayTeam] ===     [1 , 0]
    val map: HashMap<Int, List<String>> = HashMap()
    val finalTeamScoreMap: HashMap<String, Int> = HashMap()
    var winningTeam = ""


    competitions.forEachIndexed { index, strings ->
        map.put(index, strings)
    }


    // map.entries.forEachIndexed { index, languageList ->
    results.forEachIndexed { index, matchResult ->
//            for (match in map.entries) {
        //[homeTeam, awayTeam] === [1 , 0]
        if (matchResult == 0) {
            //1- get the winning team,
            //2- add score to the team,
            winningTeam = map.get(index)?.get(1) ?: ""
            //add the score to the teams here
            winnerTeamPointsHandler(finalTeamScoreMap, winningTeam, 3)
        } else {
            winningTeam = map.get(index)?.get(0) ?: ""
            winnerTeamPointsHandler(finalTeamScoreMap, winningTeam, 3)
        }
//       }
    }

    val maxValueInMap: Int = Collections.max(finalTeamScoreMap.values) // This will return max value in the Hashmap
    var finalResultant = ""
    for (teamScore in finalTeamScoreMap.entries) {  //Iterate through hashmap
        if (teamScore.value == maxValueInMap) {
            finalResultant = teamScore.key // Get the key with max value
        }
    }

    return finalResultant
}


fun winnerTeamPointsHandler(finalTeamScoreMap: HashMap<String, Int>, language: String, points: Int) {
    if (!finalTeamScoreMap.containsKey(language)) {
        finalTeamScoreMap.put(language, points)
    } else {
        val oldValue = finalTeamScoreMap.getValue(language)
        finalTeamScoreMap.replace(language, oldValue, oldValue + points)
    }
}
//endregion

//region Non-Constructible Change

fun nonConstructibleChange(coins: MutableList<Int>): Int {
    coins.sort()
    var currentChange = 0
    for (coin in coins) {
        if (coin > currentChange + 1) {
            return currentChange + 1
        }
        currentChange += coin
    }
    return currentChange + 1
}
//endregion

//region Transpose Matrix
fun transposeMatrix(matrix: MutableList<MutableList<Int>>): MutableList<MutableList<Int>> {
    val rowSize = matrix[0].size
    val columnSize = matrix.size

    val transposeMatrix: MutableList<MutableList<Int>> = MutableList(rowSize) { MutableList(columnSize) { 0 } }

    for (i in 0 until rowSize) {
        for (j in 0 until columnSize) {
            transposeMatrix[i][j] = matrix[j][i]
        }
    }
    return transposeMatrix

}

//endregion

//endregion

//region Medium Difficulty

//region Three Number Sum
fun threeNumberSum(array: MutableList<Int>, targetSum: Int): List<List<Int>> {
    val triplets: ArrayList<List<Int>> = ArrayList()

    array.sort()
    for (i in 0 until array.size - 2) { //-2 because we need at least 3 items to sum with, so our last pick will be the third last item, so we could have 2 more to sum with
        var left = i + 1
        var right = array.size - 1

        while (left < right) {
            val currentSum = array[i] + array[left] + array[right]

            if (currentSum == targetSum) {
                triplets.add(mutableListOf(array[i], array[left], array[right]))
                left += 1
                right -= 1
            }
            if (currentSum < targetSum) { //could also use else if -> i used if only because it was giving a warning on currentSum > targetSum part
                left += 1
            }
            if (currentSum > targetSum) {
                right -= 1
            }
        }
    }
    return triplets
}


//endregion

//region Smallest Difference
fun smallestDifference(arrayOne: MutableList<Int>, arrayTwo: MutableList<Int>): List<Int> {

    //region My Failed Tried Solution - and then corrected, mistake was i wasnt using Math.abs while subtracting arrayOne item to arrayTwo
//    var currentArrayOneNumber = 0
//    var currentArrayTwoNumber = 0
//    var currentSmallestDifference = Integer.MAX_VALUE
//    val listOfSmallestDifferenceNumbers = arrayListOf<Int>()
//
//    for (i in 0 ..  arrayOne.lastIndex) {
//        for (j in 0 ..  arrayTwo.lastIndex) {
//            val difference =  Math.abs(arrayOne[i] - arrayTwo[j]) //Here the mistake. not using abs lib
//
//            if (difference < currentSmallestDifference) {
//                currentSmallestDifference = difference
//                currentArrayOneNumber = arrayOne[i]
//                currentArrayTwoNumber = arrayTwo[j]
//
//            }
//        }
//    }
//    listOfSmallestDifferenceNumbers.add(currentArrayOneNumber)
//    listOfSmallestDifferenceNumbers.add(currentArrayTwoNumber)
//
//    return listOfSmallestDifferenceNumbers
    //endregion

    //region Solution 2 with Time Complexity O(nlog(n) + mlog(m)) ==> n representing length of arrayOne, m representing lenght of arrayTwo| Space Time Complexity O(1)

    var currentSmallestDifference = Integer.MAX_VALUE
    var smallestDifferenceNumber = Integer.MAX_VALUE
    var smallestPair: List<Int> = arrayListOf()
    var arrayOneIdx = 0
    var arrayTwoIdx = 0

    arrayOne.sort() //sorting inplace, to minimize our memory allocation, else if we copy and then apply sort this will increase our memory complexity
    arrayTwo.sort()

    while (arrayOneIdx < arrayOne.size && arrayTwoIdx < arrayTwo.size) {
        val firstNumber = arrayOne[arrayOneIdx]
        val secondNumber = arrayTwo[arrayTwoIdx]

        if (firstNumber < secondNumber) {
            currentSmallestDifference = secondNumber - firstNumber
            arrayOneIdx += 1
        } else if (secondNumber < firstNumber) {
            currentSmallestDifference = firstNumber - secondNumber
            arrayTwoIdx += 1
        } else { // This means arrayOne element == arrayTwo element, which will ahve the lowest difference, we will return the answer in list and finish the algo
            return arrayListOf(firstNumber, secondNumber)
        }

        if (currentSmallestDifference < smallestDifferenceNumber) {
            smallestDifferenceNumber = currentSmallestDifference
            smallestPair = arrayListOf(firstNumber, secondNumber)
        }
    }

    return smallestPair
    //endregion
}

//endregion

//region Move Element To End
fun moveElementToEnd(array: MutableList<Int>, toMove: Int): List<Int> {

    //region Solution 1 --> MY own implementation after watching conceptual video of it at AlgoExpert
//    var startIdx = 0
//    var endIdx = array.size - 1
//
//    while (startIdx < endIdx) {
//        if (array[startIdx] == toMove && array[endIdx] != toMove) {
//            //swap
//            val temp = array[endIdx]
//            array[endIdx] = array[startIdx]
//            array[startIdx] = temp
//
//            startIdx++
//            endIdx--
//        } else if (array[startIdx] == toMove && array[endIdx] == toMove) {
//            endIdx--
//        }else{
//            startIdx++
//        }
//    }
//    return array
    //endregion

    //region Solution 2 --> Actual implementation done by instructor on video at AlgoExpert
    var startIdx = 0
    var endIdx = array.size - 1

    while (startIdx < endIdx) {
        while (startIdx < endIdx && array[endIdx] == toMove) {
            endIdx -= 1
        }
        if (array[startIdx] == toMove) {
            //swap
            val temp = array[endIdx]
            array[endIdx] = array[startIdx]
            array[startIdx] = temp
        }
        startIdx++
    }
    return array
    //endregion
}

//endregion

//region Monotonic Array
fun isMonotonic(array: List<Int>): Boolean {
    // -1, -5, -10, -1100, -1100, -1101, -1102, -9001

    //my first try upon watching the conceptual video
//    var isUpwardDirection = false
//    var isDownwardDirection = false
//
//    for (i in 0..array.lastIndex) {
//        if (i + 1 < array.size) {
//            if (array[i] <= array[i + 1]) {
//                isUpwardDirection = true
//                isDownwardDirection = false
//            }else if(array[i] >= array[i + 1]){
//                isDownwardDirection = true
//                isUpwardDirection = false
//            }
//        }
//    }
//
//    return if(isUpwardDirection){
//        isUpwardDirection
//    }else{
//        isDownwardDirection
//    }

    var isNonIncreasing = true
    var isNonDecreasing = true

    for (i in 1..array.lastIndex) {
        if (array[i - 1] >= array[i]) {
            isNonDecreasing = false
        } else if (array[i - 1] <= array[i]) {
            isNonIncreasing = false
        }
    }
    return isNonIncreasing || isNonDecreasing
}

//endregion

//region Spiral Traverse
fun spiralTraverse(array: List<List<Int>>): List<Int> {
//     1,  2,  3, 4
//    12, 13, 14, 5
//    11, 16, 15, 6
//    10,  9,  8, 7

    var startRow = 0
    var startColumn = 0
    var endRow = array.lastIndex
    var endColumn = array[0].lastIndex

    val resultList = mutableListOf<Int>()

    while (startRow <= endRow && startColumn <= endColumn) {
        for (i in startColumn..endColumn) {
            resultList.add(array[startColumn][i])
        }
        for (i in startRow + 1..endRow) {
            resultList.add(array[i][endColumn])
        }
        if (startRow != endRow) {
            for (i in endColumn - 1 downTo startColumn) {
                resultList.add(array[endRow][i])
            }
        }
        if (startColumn != endColumn) {
            for (i in endRow - 1 downTo startRow + 1) {
                resultList.add(array[i][startColumn])
            }
        }
        startRow += 1
        startColumn += 1
        endRow -= 1
        endColumn -= 1
    }



    return resultList
}

fun spiralTraverseRecursive(array: List<List<Int>>): List<Int> {

    val resultList = mutableListOf<Int>()

    traverseArray(array, 0, 0, array.lastIndex, array[0].lastIndex, resultList)

    return resultList
}

fun traverseArray(
    array: List<List<Int>>,
    startRow: Int,
    startColumn: Int,
    endRow: Int,
    endColumn: Int,
    resultList: MutableList<Int>
) {
    if (startRow > endRow || startColumn > endColumn) {
        return
    }
    for (i in startColumn..endColumn) {
        resultList.add(array[startColumn][i])
    }
    for (i in startRow + 1..endRow) {
        resultList.add(array[i][endColumn])
    }
    if (startRow != endRow) {
        for (i in endColumn - 1 downTo startColumn) {
            resultList.add(array[endRow][i])
        }
    }
    if (startColumn != endColumn) {
        for (i in endRow - 1 downTo startRow + 1) {
            resultList.add(array[i][startColumn])
        }
    }

    traverseArray(array, startRow + 1, startColumn + 1, endRow - 1, endColumn - 1, resultList)
}


//endregion

//region Longest Peak
fun longestPeak(array: List<Int>): Int {
    var longestPeak = 0
    var i = 1 //

    while (i < array.size - 1) {
        val isPeak = array[i - 1] < array[i] && array[i] > array[i + 1]
        if (!isPeak) {
            i++
            continue
        }
        //we get our peak here
        var leftIdx = i - 2
        while (leftIdx >= 0 && array[leftIdx] < array[leftIdx + 1]) {
            leftIdx -= 1
        }

        var rightIdx = i + 2
        while (rightIdx < array.size && array[rightIdx] < array[rightIdx - 1]) {
            rightIdx += 1
        }

        val currentPeakLength = rightIdx - leftIdx - 1
//        longestPeak = max(longestPeak, currentPeakLength)
        if (currentPeakLength > longestPeak) {
            longestPeak = currentPeakLength
        }

        i = rightIdx
    }

    return longestPeak
}
//endregion

//region Array Of Products
fun arrayOfProducts(array: List<Int>): List<Int> {
    //region brute force approach
//    val resultant : MutableList<Int> = arrayListOf()
//    var innerIndex = 0
//    var product = 1
//    if(array.size < 3){
//        return array
//    }
//    for (i in 0..array.lastIndex) {
//      //  for (j in 0..array.lastIndex) {
//            while (innerIndex <= array.lastIndex) {
//                if(i != innerIndex) {
//                    product *= array[innerIndex]
//                }
//                innerIndex += 1
//
//            }
//        resultant.add(product)
//        product = 1
//        innerIndex = 0
//       // }
//    }
//
//    return resultant
    //endregion

    //region log(n + n + n) => log (3n) => log(n)
    //5, 1, 4, 2
//    var product = 1
//
//    val left: MutableList<Int> = mutableListOf()
//    val right: MutableList<Int> = mutableListOf()
//    val resultant = arrayListOf<Int>()
//    for (i in 0..array.lastIndex) {
//        left.add(product)
//        product *= array[i]
//    }
//    product = 1
//
//    for (i in array.lastIndex downTo 0) {
//        right.add(product)
//        product *= array[i]
//    }
//
//
//    for (i in 0..left.lastIndex) {
//        resultant.add(right.reversed()[i] * left[i])
//    }
//
//    return resultant
    //endregion

    //region more efficient complexity, log 2n and 2 less array used
    //5, 1, 4, 2

    var product = 1
    val left: IntArray = IntArray(array.size) { 0 }

    for (i in 0..array.lastIndex) {
        left[i] = product
        product *= array[i]
    }
    //left array elements = 1, 5,  5, 20
    //product             =         ,  1

    //array               = 5, 1,  4,  2

    //result              = 8, 40, 10, 20

    product = 1
    for (i in left.lastIndex downTo 0) { //3,2,1,0
        left[i] = product * left[i]
        product *= array[i]
    }

    return left.toList()

    //endregion
}

//endregion

//region First Duplicate Value
fun firstDuplicateValue(array: MutableList<Int>): Int {
    //2, 1, 5, 2, 3, 3, 4
    val map: HashMap<Int, Boolean> = HashMap()

    for (i in 0..array.lastIndex) {
        if (map.containsKey(array[i])) {
            return array[i]
        } else {
            map.put(array[i], true)
        }
    }

    return -1
}


//endregion

//region Merge Overlapping
fun mergeOverlappingIntervals(intervals: List<List<Int>>): List<List<Int>> {
//  1, 2
//  3, 5
//  4, 7
//  6, 8
//  9, 10
    val sortedInterval: List<List<Int>> = intervals.sortedWith(compareBy { intervalListItem ->
        val startingInterval = 0
        intervalListItem.get(startingInterval)
    })
    val resultant: MutableList<List<Int>> = arrayListOf()
    var currentInterval = sortedInterval[0].toMutableList()

    resultant.add(currentInterval)

    for (i in 1..sortedInterval.lastIndex) {
        val (currentIntervalStarting, currentIntervalEnding) = currentInterval
        val (nextIntervalStarting, nextIntervalEnding) = sortedInterval[i]

        if (currentIntervalEnding >= nextIntervalStarting) {
            //This means we need to merge here, as its overlapping
            //currentInterval[1] = max(currentInterval, sortedInterval[i])
            currentInterval[1] = (currentInterval + sortedInterval[i]).sortedDescending().get(0)
        } else {
            currentInterval = sortedInterval[i].toMutableList()
            resultant.add(currentInterval)
        }
    }

//    sortedInterval.forEach {
//        println(it)
//    }
    return resultant
}

//endregion

//region Best Seat
fun bestSeat(seats: MutableList<Int>): Int {
    // 1, 0, 1, 0, 0, 0, 1
    var bestSeat = -1
    var maxSpace = 0

    var leftIdx = 0

    while (leftIdx < seats.size) {
        var rightIdx = leftIdx + 1

        while (rightIdx < seats.size && seats[rightIdx] == 0) {
            rightIdx++
        }

        val availableSpace = rightIdx - leftIdx - 1

        if (availableSpace > maxSpace) {
            maxSpace = availableSpace
            bestSeat = (leftIdx + rightIdx) / 2
        }
        leftIdx = rightIdx
    }

    return bestSeat
}
//endregion

//region Zero Sum Sub-array
fun zeroSumSubarray(nums: List<Int>): Boolean {
    // 4, -3, 2, 4, -1, -5, 7

    val set: MutableSet<Int> = mutableSetOf()
    set.add(0) // initial value
    var currentSum = 0

    for (i in 0..nums.lastIndex) {
        currentSum += nums[i]

        if (set.contains(currentSum) || nums[i] == 0) {
            return true
        }
        set.add(currentSum)
    }

    return false
}
//endregion

//region Missing Numbers

// O(n) time complexity, 0(n) space complexity
fun missingNumbersMethod1(nums: MutableList<Int>): List<Int> {
    //1, 4, 3
    //1, 2, 3, 4, 5  ==> when n = 5
    //nums + 2 will be expected integer list


    val givenIntegerSet: MutableSet<Int> = mutableSetOf<Int>()
    val solution: MutableList<Int> = mutableListOf<Int>()

    for (i in 0..nums.lastIndex) {
        givenIntegerSet.add(nums[i])
    }

    for (i in 1..nums.lastIndex + 3) {
        if (!givenIntegerSet.contains(i)) {
            solution.add(i)
        }
    }

    return solution
}

fun missingNumbersMethod2(nums: MutableList<Int>): List<Int> {
    //1, 4, 3
    //1, 2, 3, 4, 5  ==> when n = 5
    var total = 0
    for (i in 1 until nums.size + 3) {
        total += i
    }

    nums.forEach {
        total -= it
    }

    val averageNumber = total / 2

    var leftSidedNumber = 0
    var rightSidedNumber = 0

    for (num in nums) {
        if (num <= averageNumber) {
            leftSidedNumber += num
        } else {
            rightSidedNumber += num
        }
    }

    var expectedLeftSidedNumber = 0
    var expectedRightSidedNumber = 0

    for (i in 1 until averageNumber + 1) {
        expectedLeftSidedNumber += i
    }
    for (i in averageNumber + 1 until nums.size + 3) {
        expectedRightSidedNumber += i
    }

    return listOf(expectedLeftSidedNumber - leftSidedNumber, expectedRightSidedNumber - rightSidedNumber)
}
//endregion

//region Majority Element
fun majorityElement(array: MutableList<Int>): Int {
    //1, 2, 3, 2, 2, 1, 2
    var answer = array[0]
    var count = 1

    for (i in 1..array.lastIndex) {
        if (answer != array[i]) {
            count -= 1

            if (count == 0) {
                answer = array[i + 1]
            }
        } else if (answer == array[i]) {
            count += 1
        }
    }
    return answer
}
//endregion

//region Sweet and Savory
fun sweetAndSavory(dishes: MutableList<Int>, target: Int): List<Int> {
    // -3, -5, 1, 7  ,  target = 8

    //Pair Lib wasn't recognized by the AlgoExpert
/*    val sweetDishes: MutableList<Int> = arrayListOf()
    val savoryDishes: MutableList<Int> = arrayListOf()
    var bestDifference = Int.MAX_VALUE
    var bestPair = Pair(0, 0)
    var sweetDishesIndex = 0
    var savoryDishesIndex = 0

    dishes.forEach {
        if (it < 0) {
            sweetDishes.add(it)
        } else if (it > 0) {
            savoryDishes.add(it)
        }
    }

    while (sweetDishesIndex < sweetDishes.size && savoryDishesIndex < savoryDishes.size) {
        val currentSum = savoryDishes[savoryDishesIndex] + sweetDishes[sweetDishesIndex]

        val currentDifference = target - currentSum

        if (currentDifference < bestDifference) {
            bestDifference = currentDifference
            bestPair = Pair(sweetDishes[sweetDishesIndex], savoryDishes[savoryDishesIndex])

            savoryDishesIndex += 1
        } else {
            sweetDishes += 1
        }

    }

    return bestPair.toList()*/

    // Getting failed test cases, this is the same solution that was explained in the video
    val sweetDishes: MutableList<Int> = mutableListOf()
    val savoryDishes: MutableList<Int> = mutableListOf()
    var bestDifference = Int.MAX_VALUE
    val bestPair = mutableListOf<Int>(0, 0)
    var sweetDishesIndex = 0
    var savoryDishesIndex = 0

    dishes.forEach {
        if (it < 0) {
            sweetDishes.add(it)
        } else if (it > 0) {
            savoryDishes.add(it)
        }
    }

    sweetDishes.sortDescending()
    savoryDishes.sort()

    print("SweetDishes : ${sweetDishes} \n")
    print("SavoryDishes : ${savoryDishes} \n")

    while (sweetDishesIndex < sweetDishes.size && savoryDishesIndex < savoryDishes.size) {
        val currentSum = sweetDishes[sweetDishesIndex] + savoryDishes[savoryDishesIndex]

        if (currentSum <= target) {
            val currentDifference = target - currentSum
            if (currentDifference < bestDifference) {
                bestPair.clear()
                bestPair.addAll(0, listOf(sweetDishes[sweetDishesIndex], savoryDishes[savoryDishesIndex]))
                bestDifference = currentDifference
            }
            savoryDishesIndex += 1
        } else {
            sweetDishesIndex += 1
        }
    }

    return bestPair

    //
//    dishes.sort()
//
//    var leftIndex = 0
//    var rightIndex = dishes.size - 1
//    var bestDifference = Int.MIN_VALUE
//    val bestPair = mutableListOf<Int>(0, 0)
//
//    while (leftIndex < rightIndex && dishes[leftIndex] < 0 && dishes[rightIndex] > 0) {
//        val currentSum = dishes[leftIndex] + dishes[rightIndex]
//        if (currentSum == target) {
//            bestPair.clear()
//            bestPair.addAll(0, listOf<Int>(dishes[leftIndex], dishes[rightIndex]))
//            return bestPair
//        } else if (currentSum > target) {
//            rightIndex -= 1
//        } else {
//            //currentSum <= target
//            if (currentSum > bestDifference) {
//                bestPair.clear()
//                bestPair.addAll(0, listOf<Int>(dishes[leftIndex], dishes[rightIndex]))
//                bestDifference = currentSum
//            }
//            leftIndex++
//        }
//    }
//    return bestPair

    //{
    //  "dishes": [-12, 13, 100, -53, 540, -538, 53, 76, 32, -63],
    //  "target": 42
    //}

    //Expected Output
    //[-12, 53]
    //Your Code's Output
    //[-538, 540]
}

//endregion


//endregion

//region Hard Difficulty
fun fourNumberSum(array: MutableList<Int>, targetSum: Int): List<List<Int>> {
    val pairs: MutableMap<Int, MutableList<MutableList<Int>>> = HashMap()
    val quadruplets: MutableList<List<Int>> = mutableListOf()

    for (i in 1..array.lastIndex) {

        for (j in i + 1 until array.size) {
            val currentSum = array[i] + array[j]
            val difference = targetSum - currentSum

            if (pairs.containsKey(difference)) {
                //add the elements by make a pair to ->pairs map
                if (pairs[difference] != null) {
                    for (pair in pairs[difference]!!) {
                        val quadruplet = pair + listOf(array[i], array[j])
                        quadruplets.add(quadruplet)
                    }
                }
            }
        }

        for (k in 0 until i) {
            val currentSum = array[i] + array[k]
            if (!pairs.containsKey(currentSum)) {
                pairs[currentSum] = mutableListOf(
                    mutableListOf(array[i], array[k])
                )
            }else{
                pairs[currentSum]?.add(mutableListOf(array[i], array[k]))
            }
        }


    }


    return quadruplets
}

//endregion

//endregion
