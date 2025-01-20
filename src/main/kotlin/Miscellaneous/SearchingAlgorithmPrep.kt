package Miscellaneous

import java.util.*
import kotlin.collections.ArrayList

/**
 * Logarithmic time complexity log(n): Represented in Big O notation as O(log n),
 * when an algorithm has O(log n) running time,
 * it means that as the input size grows, the number of operations grows very slowly.
 * Example: binary search.

 * So I think now it’s clear for you that a log(n) complexity is extremely better than a linear complexity O(n).
 * Even though O(n), linear time is already pretty good for an algorithm.
 * log(n) time is gonna be way better as the size of your input increases.
 */
fun main(args: Array<String>) {

    //Linear Search
    /*
    val stringList: ArrayList<String> = arrayListOf("NANDAtO", "OMAE WA MO", "NAANI", "YAAY")
    val intList: ArrayList<Int> = arrayListOf(11, 23, 32, 14)

    val stringValueToFind = "NAANI"
    val intValueToFind = 32

    //SearchingAlgorithms().linearSearch(list, valueToFind)
    SearchingAlgorithms().linearSearchRecursion(intList, intList.size, intValueToFind)
    */

    //Binary Search
    val intList: ArrayList<Int> = arrayListOf(11, 23, 31, 32,32)
    //SearchingAlgorithms().binarySearch(intList, 32)
    val startingIndex = 0
    val endingIndex = intList.size - 1
    val search = SearchingAlgorithms().binarySearchRecursion(intList,startingIndex,endingIndex, valueToFind = 32)
    println("Found key at Index: $search")

}

public class SearchingAlgorithms {

    //Linear Search -> Time complexity: O(N)
    fun linearSearch(inputArray: ArrayList<String>, valueToFind: String) {
        for (i in 0 until inputArray.size) {
            if (inputArray[i].lowercase(Locale.getDefault()) == valueToFind.lowercase(Locale.getDefault())) {
                println("Value was found in the List at Pos: $i")
                break //either break it or just make the functions return the int value so that you dnt have to print and break each and everytime
            } else {
                println("Value was not found in the List")
                break //either break it or just make the functions return the int value so that you dnt have to print and break each and everytime
            }
        }
    }

    //Linear Search with Recursion -> Time complexity: O(N)
    fun linearSearchRecursion(inputArray: ArrayList<Int>, size: Int, valueToFind: Int) {
        if (size == 0) {
            println("Empty array")
        } else if (inputArray[size - 1] == valueToFind) {
            println("Value was found in the List at Pos: ${size - 1}")

        } else {
            linearSearchRecursion(inputArray, size - 1, valueToFind)
        }
    }

    //Binary Search -(built-in function name "arrayList.binarySearchBy(_value_toFind_here)")
    // Binary Search pre-require -> Sorted Array
    fun binarySearch(inputArray: ArrayList<Int>, valueToFind: Int) {
        var startingIndex = 0
        var endingIndex = inputArray.size - 1
        val mid = (startingIndex + endingIndex) / 2

        for (i in 0..endingIndex) {
            if (inputArray[mid] == valueToFind) {
                println("Found at Index: $i")
                break //either break it or just make the functions return the int value so that you dnt have to print and break each and everytime
            } else if (inputArray[mid] > valueToFind) {
                endingIndex = mid - 1
                println("Found at Index: $endingIndex")
                break //either break it or just make the functions return the int value so that you dnt have to print and break each and everytime
            } else if (inputArray[mid] < valueToFind) {
                startingIndex = mid + 1
                println("Found at Index: $startingIndex")
                break //either break it or just make the functions return the int value so that you dnt have to print and break each and everytime
            }
        }
    }

    // Binary Search with Recursion -> Time Complexity: O (log n) both in Iterative approach and Recursive
    // Binary Search pre-require -> Sorted Array
    fun binarySearchRecursion(inputArray: ArrayList<Int>, startingIndex: Int, endingIndex: Int, valueToFind: Int): Int? {
        val mid = (startingIndex + endingIndex) / 2

        // for (i in 0 until endingIndex) {
        while (startingIndex <= endingIndex) {
            if (inputArray[mid] == valueToFind) {
                return mid + 1
            } else if (inputArray[mid] > valueToFind) {
                //endingIndex = mid - 1
                return binarySearchRecursion(inputArray, startingIndex, mid - 1, valueToFind)
            }
            // else if (inputArray[mid] < valueToFind) {
            else {
                //startingIndex = mid + 1
                return binarySearchRecursion(inputArray, mid + 1, endingIndex, valueToFind)
            }
        }
        return -1
    }

}