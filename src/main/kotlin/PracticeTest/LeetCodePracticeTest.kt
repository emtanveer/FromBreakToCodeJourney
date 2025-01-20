package PracticeTest

import Miscellaneous.printArray

fun main() {

    //88. Merge Sorted Array
//    val nums1: IntArray = intArrayOf(1, 2, 3, 0, 0, 0)
//    val nums2: IntArray = intArrayOf(2, 5, 6)
//    val n = 3
//    val m = 3
//    merge(nums1, m, nums2, n)
//    var nums1: IntArray = intArrayOf(1, 2, 3, 0, 0, 0)
//    var nums2: IntArray = intArrayOf(2, 5, 6)
//    val n = 3
//    val m = 3

    //27. Remove Element
//    val nums: IntArray = intArrayOf(3, 2, 2, 3)
//    val nums: IntArray = intArrayOf(0,1,2,2,3,0,4,2)
//    val `val` = 2
//    print(removeElement(nums, `val`))

    //26. Remove Duplicates from Sorted Array
//    val nums: IntArray = intArrayOf(1, 1, 2)
//    removeDuplicates(nums)

}

//region Array

/**
 * 88. Merge Sorted Array
 */
fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int) {

    var i = m - 1 // pointer for total element of nums1
    var j = n - 1 // pointer for total element of nums2
    var k = m + n - 1 // total of element nums1 + nums2
    // for the example input, then the K value will be 5

    // looping both array from end of the array
    while (i >= 0 && j >= 0) {
        // compare the element from end of the array
        if (nums1[i] > nums2[j]) {
            // putting the largest element on the end of nums1
            // then substract the k and i everytime we loop through the array
            nums1[k] = nums1[i]
            k--
            i--
        } else {
            /**
            still same idea, putting the largest element to the end of nums1,
            If the nums2[j] > nums1[i],
            Then substract the k and j everytime we loop through the array
             */
            nums1[k] = nums2[j]
            k--
            j--
        }
    }

    // if there is any nums2 elements left then copy them to nums1
    // reason why we only check nums2 elements because we copy all element to nums1.
    while (j >= 0) {
        nums1[k] = nums2[j]
        k--
        j--
    }

    nums1.forEach {
        print(it)
    }
}

fun mergeTwo(nums1: IntArray, m: Int, nums2: IntArray, n: Int) {

    var i = 0
    var j = 0
    var k = 0

    while (i < m && j < n && k < m + n) {
        if (nums1[i] < nums2[j]) {
            nums1[k++] = nums1[i++]
        } else if (nums1[i] > nums2[j]) {
            nums1[k++] = nums2[j++]
        } else {
            nums1[k++] = nums1[i++]
        }
    }


    nums1.forEach {
        print(it)
    }
}


/**
 * 27. Remove Element
 */
fun removeElement(nums: IntArray, `val`: Int): Int {
    var lastNotToRemoveIndex = 0

    nums.forEach { element ->
        if (element == `val`) {
            return@forEach
        } else {
            nums[lastNotToRemoveIndex] = element
            lastNotToRemoveIndex++
        }
    }

    return lastNotToRemoveIndex
}


/**
 * 26. Remove Duplicates from Sorted Array
 */
//fun removeDuplicates(nums: IntArray): Int {
//
//    return 0
//}

//endregion





























