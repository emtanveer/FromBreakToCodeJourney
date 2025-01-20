package Miscellaneous

fun main(args: Array<String>) {
    // PartList
    //val arr: Array<String> = arrayOf("az", "toto", "picaro", "zone", "kiwi")
    //val arr: Array<String> = arrayOf("cdIw", "tzIy", "xDu", "rThG")
    //val result = partList(arr)
    //printArray(result)

    //Sum of positive
    val arr = intArrayOf(1,-4,7,12)
    println(sum(arr))
}


//function that gives all the ways to divide a list (an array) of at least two elements into two non-empty parts.
//fun partList(arr: ArrayList<String>): Array<Array<String>> {
fun partList(arr: Array<String>): Array<Array<String>> {
    return (0 until arr.size - 1).map {
            arrayOf(
                arr.sliceArray(0..it).joinToString(" "),
                arr.sliceArray(it + 1 until arr.size).joinToString(" ")
            )
        }.toTypedArray()
}


// Factor is a factor of base.(The function should test if the factor is a factor of base)
fun checkForFactor(base: Int, factor: Int): Boolean {
    return base % factor == 0
}

//Sum of positive
fun sum(numbers: IntArray): Int {
    var grandTotal = 0
    numbers.forEachIndexed { index, i ->
        if (numbers[index] > 0)
            grandTotal += numbers[index]
    }
    return grandTotal
}










// Prints the array
fun printArray(arr: Array<Array<String>>) {
//    val n = arr.size
//    for (i in 0 until n) {
//        print(arr[i].toString() + " ")
//    }
    println(arr.contentDeepToString())


}