package Miscellaneous

fun main(args: Array<String>) {

    //Selection Sort
    //val intList: IntArray = intArrayOf(51, 12, 33, 24, 22)
    val intList: IntArray = intArrayOf(10, 9, 8, 7, 6, 5, 4, 3, 2, 1)

    //SortingAlgorithms().selectionSort(intList)

    // SortingAlgorithms().bubbleSort(intList)
    // SortingAlgorithms().bubbleSortWithRecursion(intList, intList.size)
    val left = 0
    val right = intList.size - 1

    SortingAlgorithms().mergeSortList(intList, left, right)
    SortingAlgorithms().printArray(intList)

}

public class SortingAlgorithms {

    //Selection Sort -> Time Complexity: is O(N power 2 -> N2 -> not N times 2) as there are two nested loops:
    fun selectionSort(arrayInput: IntArray) {

        // One by one move boundary of unsorted sub-array
        for (i in 0 until arrayInput.size - 1) {
            // Find the minimum element in unsorted array
            var minIndex = i
            println("print default outer J loop minIndex $minIndex")

            for (j in i + 1 until arrayInput.size) {
                if (arrayInput[minIndex] > arrayInput[j]) {
                    minIndex = j
                    println("print MinIndex = J: $minIndex")
                }
            }

            println("Before Swapping")
            //swap both values
            val temp = arrayInput[minIndex]
            arrayInput[minIndex] = arrayInput[i]
            arrayInput[i] = temp

            println("After Swapping Swapping")

        }
    }

    //Bubble Sort -> Time Complexity: is O(N power 2 -> N2 -> not N times 2) as there are two nested loops: each loop is equal = n-1
    // for 2 loops(n-1) and the if statement/condition(C)
    // we drive this formula :
    // (n-1) x (n-1) x C => Cn2 - 2Cn + 1 (in Polynomial we take the highest order term)
    fun bubbleSort(arrayInput: IntArray) {
        //51, 12, 33, 24, 55

        for (i in 0 until arrayInput.size) {
            for (j in 0..arrayInput.size - 2) {
                if (arrayInput[j] > arrayInput[j + 1]) {
                    //swap arrayInput[j+1] and arrayInput[j]              // For  i = 0, j = 1:
                    val temp = arrayInput[j]                              //        temp   = 51,
                    arrayInput[j] = arrayInput[j + 1]                     //arrayInput[i]  = 12
                    arrayInput[j + 1] = temp                              //arrayInput[j]  = 51
                }
            }
        }
    }

    //Bubble Sort ->
    fun bubbleSortWithRecursion(arrayInput: IntArray, n: Int) {
        if (n == 0 || n == 1) {
            return
        }

        for (i in 0 until n - 1) {
            if (arrayInput[i] > arrayInput[i + 1]) {

                val temp = arrayInput[i]
                arrayInput[i] = arrayInput[i + 1]
                arrayInput[i + 1] = temp
            }

            bubbleSortWithRecursion(arrayInput, n - 1)
        }
    }

    // Prints the array
    fun printArray(arr: IntArray) {
        val n = arr.size
        for (i in 0 until n) {
            print(arr[i].toString() + " ")
        }
        println()
    }


    //Insertion Sort


    // Merges two sub-arrays of arr[].
    // First sub-array is arr[l..m]
    // Second sub-array is arr[m+1..r]
    private fun merge(arr: IntArray, left: Int, mid: Int, right: Int) {
        // Find sizes of two sub-arrays to be merged
        val n1 = mid - left + 1
        val n2 = right - mid

        /* Create temp arrays */
        val tempLeftArray = IntArray(n1)
        val tempRightArray = IntArray(n2)

        /*Copy data to temp arrays*/
        for (i in 0 until n1) tempLeftArray[i] = arr[left + i]
        for (j in 0 until n2) tempRightArray[j] = arr[mid + 1 + j]

        /* Merge the temp arrays */

        // Initial indexes of first and second sub-arrays
        var leftArrayIndex = 0
        var rightArrayIndex = 0

        // Initial index of merged sub-array array
        //below current variable is actual index of the main array, jaha pe valye ne jaa kar place hona hai after sorting
        var current = left
        while (leftArrayIndex < n1 && rightArrayIndex < n2) {
            if (tempLeftArray[leftArrayIndex] <= tempRightArray[rightArrayIndex]) {
                arr[current] = tempLeftArray[leftArrayIndex]
                leftArrayIndex++
            } else { // means (tempRightArray[rightArrayIndex] <= tempLeftArray[leftArrayIndex])
                arr[current] = tempRightArray[rightArrayIndex]
                rightArrayIndex++
            }
            current++
        }

        /* Copy remaining elements of L[] if any */
        while (leftArrayIndex < n1) {
            arr[current] = tempLeftArray[leftArrayIndex]
            leftArrayIndex++
            current++
        }

        /* Copy remaining elements of R[] if any */
        while (rightArrayIndex < n2) {
            arr[current] = tempRightArray[rightArrayIndex]
            rightArrayIndex++
            current++
        }
    }

    // Main function that sorts arr[l..r] using
    // merge()
    fun mergeSortList(arr: IntArray, left: Int, right: Int) {
        if (left < right) {                    // 0 < 4
            // Find the middle point
            val mid = (left + right) / 2        //0+4 => 4/2 => 2

            // Sort first and second halves
            mergeSortList(arr, left, mid)            // rec (list, 0, 2)
            mergeSortList(arr, mid + 1, right)  // rec (list, 2+1, 4)

            // Merge the sorted halves
            merge(arr, left, mid, right)
        }
    }


}