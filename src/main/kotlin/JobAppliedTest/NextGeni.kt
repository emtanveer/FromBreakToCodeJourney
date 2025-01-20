package JobAppliedTest

fun main() {
    //Question
    // Next 100 number
    //  83   => 100
    //  101 => 200
    //  339 => 400
    //  1011 => 1100

    // 339 -> 400

    val number = 1011
    println(getClosestHundredthNumber(number))

//    val sc = SomeClass()
//    sc.a = 10
//    println("Main Return: "+ sc.a)
//
//    sum(5, sc)
//    println("Main Return 2: "+ sc.a)

}

fun getClosestHundredthNumber(number: Int): Int {
    // Loop jump to 100th
    // Difference, If the lowest is there return it else we need it to continue

    //region Solution 1 --> This is what i wrote on the TEST
    var cycleNumber = 0
//    var nextCycleNumber = 0
   var resultant = 0
//
//    for (i in 0 until Integer.MAX_VALUE) { //1500
//        cycleNumber += 100
//        nextCycleNumber = cycleNumber + cycleNumber
////
////        // 100 - 83 < 200 - 83 ==> `17 < 117` ==> 100 is resultant as cyclenumber
//        if (cycleNumber - number < nextCycleNumber - number || cycleNumber - number == nextCycleNumber - number) {//If first cycle difference is smaller
//            resultant = cycleNumber
//            if (number < cycleNumber) {
//                break
//            }
//        } else if (cycleNumber - number > nextCycleNumber - number) {//If second cycle difference is smaller
//            resultant = nextCycleNumber
//            if ( (number > cycleNumber) && (number < nextCycleNumber) ) {
//                break
//            }
//        }
//
//
//
//    }
//    return resultant
    //endregion

    //region Solution 2
    for (i in 0 until Integer.MAX_VALUE) { //1500
        cycleNumber += 100
        if (number <= cycleNumber) {
            resultant = cycleNumber
            break
        }
    }
    return resultant

    //endregion
}

class SomeClass {
    var a: Int = 0
}

fun sum(a: Int, b: SomeClass) {
    println(b.a)
    b.a = 100
    //println(b.a)
}