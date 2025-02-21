package PracticeTest

fun main() {

    //88. Merge Sorted Array
//    val nums1: IntArray = intArrayOf(1, 2, 3, 0, 0, 0)
//    val nums2: IntArray = intArrayOf(2, 5, 6)
//    val n = 3
//    val m = 3
//
//    merge(nums1, m, nums2, n)
//    var nums1: IntArray = intArrayOf(1, 2, 3, 0, 0, 0)
//    var nums2: IntArray = intArrayOf(2, 5, 6)
//    val n = 3
//    val m = 3
//    mergeTwo(nums1, m, nums2, n)

//    val nums1: IntArray = intArrayOf(0)
//    val nums2: IntArray = intArrayOf(1)
//    val n = 1
//    val m = 0

//    var nums1: IntArray = intArrayOf(1, 2, 3, 0, 0, 0)
//    var nums2: IntArray = intArrayOf(2, 5, 6)
//    val n = 3
//    val m = 3
//    mergeThree(nums1, m, nums2, n)

//    27. Remove Element
    //val nums: IntArray = intArrayOf(3, 2, 2, 3)
//    val nums: IntArray = intArrayOf(0, 1, 2, 2, 3, 0, 4, 2)
//    val `val` = 2
//    println("\n" + removeElementTwo(nums, `val`))

    //26. Remove Duplicates from Sorted Array
//     val nums: IntArray = intArrayOf(1, 1, 1, 2, 2, 3)
//      println(removeDuplicates(nums))

    val nums: IntArray = intArrayOf(1, 1, 1, 2, 2, 3)
    println(removeDuplicatesTwo(nums))


}

//region Array

/**
 * 88. Merge Sorted Array
 */
fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int) {

    var i = m - 1 // pointer for total/last element of nums1
    var j = n - 1 // pointer for total/last element of nums2
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

fun mergeThree(nums1: IntArray, m: Int, nums2: IntArray, n: Int) {
    var firstArrayLastElementPointer = m - 1
    var secondArrayLastElementPointer = n - 1
    var firstArrayTotalIndex = m + n - 1


    while (firstArrayLastElementPointer >= 0 && secondArrayLastElementPointer >= 0) {
        if (nums1[firstArrayLastElementPointer] > nums2[secondArrayLastElementPointer]) {
            nums1[firstArrayTotalIndex--] = nums1[firstArrayLastElementPointer]
            firstArrayLastElementPointer--
        } else {
            nums1[firstArrayTotalIndex--] = nums2[secondArrayLastElementPointer]
            secondArrayLastElementPointer--
        }
    }

    // if there is any nums2 elements left then copy them to nums1
    // reason why we only check nums2 elements because we copy all element to nums1.

    nums1.forEach {
        println(it)
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

fun removeElementTwo(nums: IntArray, `val`: Int): Int {
    var uniqueElements = 0
    var rightMostIndex = nums.size - 1


    nums.forEachIndexed { index, _ ->
        if (index > rightMostIndex) return@forEachIndexed // Stop early /or If we reach the right-most processed index

        if (nums[index] == `val`) {

            // Move rightMostIndex left until it finds a non-val element
            while (rightMostIndex > index && nums[rightMostIndex] == `val`) {
                rightMostIndex--
            }

            // Swap only if index is still valid
            if (index < rightMostIndex) {
                nums[index] = nums[rightMostIndex].also { nums[rightMostIndex] = nums[index] } //swap
                rightMostIndex--
            }
        }
        // Count non-val elements immediately
        if (nums[index] != `val`) {
            uniqueElements++
        }
    }

//    nums.forEach {
//        print("$it ")
//    }
    return uniqueElements
}


/**
 * 26. Remove Duplicates from Sorted Array
 */
fun removeDuplicates(nums: IntArray): Int {
    //1,1,1,2,2,3
    var k: Int = 0
    var occurrence: Int = 1

    for (i in nums.indices) {
        if (i < nums.size - 1 && nums[i] == nums[i + 1]) {
            occurrence++
        } else {
            occurrence = 1
        }

        if (occurrence <= 2) {
            nums[k] = nums[i]
            k++
        }
    }
    return k

}

fun removeDuplicatesTwo(nums: IntArray): Int {
    var k: Int = 0
    var occurrence: Int = 1

    for (i in nums.indices) {
        if (i < nums.size - 1 && nums[i] == nums[i + 1]) {
            occurrence++
        } else {
            occurrence = 1
        }

        if (occurrence <= 2) {
            nums[k] = nums[i]
            k++
        }
    }
    return k
}


//endregion





























