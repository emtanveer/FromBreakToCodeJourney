package JobAppliedTest//fun main(args: Array<String>){
//    val intList: IntArray = intArrayOf(10, 9, 8, 7, 6, 5, 4, 3, 2, 1)
//    val left = 0
//    val right = intList.size - 1
//    mergeSortList(intList, left, right)
//    printArray(intList)
//}
//
//fun merge(arr:IntArray, left: Int, mid: Int, right: Int){
//
//    // Find sizes of two sub-arrays to be merged
//    val n1 = mid - left + 1
//    val n2 = right - mid
//
//    //create temp arrays
//    val tempLeftArray = IntArray(n1)
//    val tempRightArray = IntArray(n2)
//
//    /*Copy data to temp arrays*/
//    for (i in 0 until n1) tempLeftArray[i] = arr[left + i]
//    for (j in 0 until n2) tempRightArray[j] = arr[mid + j + 1]
//
//    //create intial index values for both arrays above
//    var leftArrayIndex = 0
//    var rightArrayIndex = 0
//
//    //Initial index of merged array
//    var current = left
//
//    //logic
//        while (leftArrayIndex < n1 && rightArrayIndex < n2){
//            if(tempLeftArray[leftArrayIndex] <= tempRightArray[rightArrayIndex]){
//                arr[current] = tempLeftArray[leftArrayIndex]
//                leftArrayIndex++
//            }else{
//                arr[current] = tempRightArray[rightArrayIndex]
//                rightArrayIndex++
//            }
//            current++
//    }
//
//    //Copy the remaining parts of the sub-arrays
//    while (leftArrayIndex < n1) {
//        arr[current] = tempLeftArray[leftArrayIndex]
//        leftArrayIndex++
//        current++
//    }
//    while (rightArrayIndex < n2) {
//        arr[current] = tempRightArray[rightArrayIndex]
//        rightArrayIndex++
//        current++
//    }
//
//}
//
//fun mergeSortList(arr:IntArray, left: Int, right: Int){
//    if(left < right){
//        val mid = (left+right)/2
//
//        mergeSortList(arr,left,mid)
//        mergeSortList(arr,mid+1,right)
//
//        merge(arr,left,mid,right)
//    }
//}
//// Prints the array
//fun printArray(arr: IntArray) {
//    val n = arr.size
//    for (i in 0 until n) {
//        print(arr[i].toString() + " ")
//    }
//}