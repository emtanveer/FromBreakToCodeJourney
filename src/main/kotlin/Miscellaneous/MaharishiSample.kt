package Miscellaneous

fun main(args: Array<String>) {
//    val oddNumberElementArray = arrayListOf<Int>(3, 2, 1, 4, 5)
//    val getCenteredArray = isCenteredArray(oddNumberElementArray)
//    println("\n" + getCenteredArray)

//    val numberArray = arrayListOf<Int>(1, 2, 3, 4)
//    println("Difference Answer: ${sumOfOddEvenNumberWithTheDifference(numberArray)}")

//    val charArray = arrayListOf<Char>('a', 'b', 'c')
//    println("Char Array Return Answer: ${returnCharArrayDependOnLength(charArray, -1, 2)}")

//    val number = -12345
//    println("Reversed number for $number is : ${reverseInteger(number)}")

//    val firstArray = arrayListOf<Int>(1, 8, 3, 2)
//    val secondArray = arrayListOf<Int>(4, 2, 6, 1)
//    println("Common Numbers are: ${commonNumberInTwoArrays(firstArray, secondArray)}")

    val arr = arrayListOf<Int>(1, 5, 3, 1, 1, 1, 1, 1, 1)
    println("Point of Equilibrium Index is : ${getPointOfEquilibrium2(arr)}")
}

private fun isCenteredArray(oddNumberElementArray: ArrayList<Int>): Int {

    if (oddNumberElementArray.isNullOrEmpty() || oddNumberElementArray.size % 2 == 0) return 0

//    for (i in 0 until oddNumberElementArray.size) {
//        return if (i != centeredElementIndex && centeredElement <= oddNumberElementArray[i]) {
//            1
//        } else {
//            //We get our centered Array
//            0
//        }
//    }

    val midIndex: Int = oddNumberElementArray.size / 2
    val middleItem: Int = oddNumberElementArray.get(midIndex)

    for (i in 0 until oddNumberElementArray.size) {
        if (i != midIndex && middleItem >= oddNumberElementArray[i]) {
            return 0
        }
    }
    return 1 //Means Array is centered
}

private fun sumOfOddEvenNumberWithTheDifference(numberArray: ArrayList<Int>): Int {
    // arr = { 3, 2, 1, 4, 5 }

    var sumOfEvenNumbers = 0 // Y
    var sumOfOddNumbers = 0 // X

    if (numberArray.isNullOrEmpty()) return 0
    if (numberArray.size == 1) return numberArray[0]

    numberArray.forEachIndexed { index, element ->
        if (element % 2 == 0) {
            //numbers even
            sumOfEvenNumbers += element
        } else {
            //number is odd
            sumOfOddNumbers += element
        }
    }
    //Params:
    //x – the first value
    //y – the second value to subtract from the first

    //in case of {1,2,3}
    // 1+3(odd) - 2(even)
    // 4-2 = 2
    //in case of {1, 2, 3, 4}
    // 1+3(odd) - 2+4(even)
    // 4 - 6 = -2
    return Math.subtractExact(sumOfOddNumbers, sumOfEvenNumbers) //Result = X-Y
}

private fun returnCharArrayDependOnLength(charArray: ArrayList<Char>, startingPos: Int, length: Int): ArrayList<Char>? {

    val desiredArray = ArrayList<Char>()
    var userDesiredLength = 0

    if (
        charArray.isNullOrEmpty() ||
        (startingPos < 0 || startingPos > charArray.size || length > charArray.size) ||
        (startingPos + length > charArray.size)
    ) {
        return null
    }
    println("length: $length")

    if (startingPos == 0) {
        for (i in startingPos until length) {
            desiredArray.add(charArray[i])
        }
    } else {
        for (i in startingPos..length) {
            desiredArray.add(charArray[i])
        }
    }

    return desiredArray
}

private fun reverseInteger(integerNumber: Int): Int {
    var numberToReverse = integerNumber
    var reverseResult = 0

    while (numberToReverse != 0) {
        reverseResult = (numberToReverse % 10) + (reverseResult * 10)
        numberToReverse = numberToReverse / 10
    }
    return reverseResult
}

private fun commonNumberInTwoArrays(firstArray: ArrayList<Int>?, secondArray: ArrayList<Int>?): ArrayList<Int>? {

    val finalCommonNumberArray = ArrayList<Int>()

    if ((firstArray == null && secondArray == null) || (firstArray == null || secondArray == null)) return null

    if (firstArray!!.isEmpty() && secondArray!!.isEmpty()) {
        return arrayListOf()
    } else {
        for (i in 0 until firstArray.size) {
            for (j in 0 until secondArray!!.size) {
                if (firstArray[i] == secondArray[j]) {
                    firstArray[i]?.let { finalCommonNumberArray.add(it) }
                }
            }
        }
    }
    return finalCommonNumberArray
}

private fun getPointOfEquilibrium(numberArray: ArrayList<Int>): Int {

    for (i in 0 until numberArray.size) {
        var leftSum = 0
        var rightSum = 0

        for (j in 0 until i) {
            leftSum += numberArray[j]
        }

        for (j in i + 1 until numberArray.size) {
            rightSum += numberArray[j]
        }

        if (rightSum == leftSum) {
            return i
        }
    }

    return -1
}

private fun getPointOfEquilibrium2(numberArray: ArrayList<Int>): Int {

    for (i in 0 until numberArray.size) {
        var leftSum = 0
        var rightSum = 0

        for (j in 0 until i) {
            leftSum += numberArray[j]
        }
        for (j in i + 1 until numberArray.size) {
            rightSum += numberArray[j]
        }

        if (rightSum == leftSum) {
            return i
        }

    }
    return -1
}
