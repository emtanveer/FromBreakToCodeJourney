package JobAppliedTest

import Miscellaneous.printArray

fun main(args: Array<String>) {
    val intList: IntArray = intArrayOf(10, 9, 8, 7, 6, 5, 4, 3, 2, 1)
//    val left = 0
//    val right = intList.size - 1
//    mergeSortList(intList, left, right)

//    bubbleSort(intList)
    selectionSort(intList)
    intList.printArray()
}

fun merge(arr: IntArray, left: Int, mid: Int, right: Int) {
    //Ranges for the sub-arrays
    val n1 = mid - left + 1
    val n2 = right - mid

    //Create temp Array
    val tempLeftArray = IntArray(n1)
    val tempRightArray = IntArray(n1)

    // Copy the original array
    for (i in 0 until n1) tempLeftArray[i] = arr[left + i]
    for (j in 0 until n2) tempRightArray[j] = arr[mid + j + 1]

    //Initial the indexes for sub-arrays
    var leftIndex = 0
    var rightIndex = 0

    //Initialize main array index
    var currentIndex = left

    while (leftIndex < n1 && rightIndex < n2) {
        if (tempLeftArray[leftIndex] <= tempRightArray[rightIndex]) {
            arr[currentIndex] = tempLeftArray[leftIndex]
            leftIndex++
        } else {
            arr[currentIndex] = tempRightArray[rightIndex]
            rightIndex++
        }
        currentIndex++
    }
    //Copy remamining element if any two halves exhaust
    while (leftIndex < n1) {
        arr[currentIndex] = tempLeftArray[leftIndex]
        leftIndex++
        currentIndex++
    }
    while (rightIndex < n2) {
        arr[currentIndex] = tempRightArray[rightIndex]
        rightIndex++
        currentIndex++
    }
}

fun mergeSortList(arr: IntArray, left: Int, right: Int) {
    if (left < right) {
        val mid = (left + right) / 2

        mergeSortList(arr, left, mid)
        mergeSortList(arr, mid + 1, right)

        //merge the sort sub arrays partially, first left and then right
        merge(arr, left, mid, right)
    }
}

fun bubbleSort(arr: IntArray) {
    for (i in 0 until arr.size) {
        for (j in 0..arr.size - 2) {
            if (arr[j] > arr[j+1]) {
                val temp = arr[j]
                arr[j]= arr[j+1]
                arr[j+1] = temp
            }
        }
    }
}

fun selectionSort(arr:IntArray){
   for(i in 0 until arr.size-1){

      var minIndex = i

       for(j in i+1 until arr.size){
           if(arr[minIndex] > arr[j]){
               minIndex = j
           }
       }

       val temp = arr[minIndex]
       arr[minIndex] = arr[i]
       arr[i] = temp

   }
}

fun abc(){}
fun abc(a : Int) {

}
