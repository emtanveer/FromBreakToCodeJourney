package PracticeTest

fun main() {
    //region Sweet And Savory
//    val dishes: MutableList<Int> = mutableListOf(-3, -5, 1, 7)
//    val target = 8
//    sweetAndSavory(dishes, target).forEach {
//        print("$it ")
//    }

    //endregion
    val array: MutableList<Int> = mutableListOf(1, 2, 3, 2, 2, 1, 2)
    println(majorityElement(array))

}

//region Sweet And Savory
fun sweetAndSavory(dishes: MutableList<Int>, target: Int): List<Int> {
    var left = 0
    var right = dishes.size - 1
    var bestSum = Int.MIN_VALUE
    var bestDishPair: List<Int> = listOf(0, 0)

    dishes.sort()

    while (left < right && dishes[left] < 0 && dishes[right] > 0) {
        val currentSum = dishes[left] + dishes[right]

        if (currentSum <= target) {
            if (currentSum > bestSum) {
                bestSum = currentSum
                bestDishPair = listOf(dishes[left], dishes[right])
            }
            left += 1
        } else {
            right -= 1
        }
    }

    return bestDishPair
}
//endregion

//region Majority Elements
fun majorityElement(array: MutableList<Int>): Int {
    // 1, 2, 3, 2, 2, 1, 2
    var answer = array[0]
    var count = 1
    var index = 1

    while (index > 0 && (index + 1) < array.size){
        if(answer != array[index]){
            count--

            if(count == 0){
                answer = array[index + 1]
            }
        }else {
            count++
        }

        index++
    }

    return answer
}
//endregion