package JobAppliedTest

fun main() {
    //println(VowelCount("hello"))

//    println(SerialNumber("11.124.667"))
//    println(SerialNumber("114.568.112"))
//    println(SerialNumber("224.315.218"))
}

fun SerialNumber(str: String): String {

    val strs = str.split(".").toTypedArray()

    //Check for the First Constraint
    var isSerialNumber = true

    for (i in 0..strs.lastIndex) {
        if (strs[i].length != 3) {
            isSerialNumber = false
        }
    }

    //Check for the Second Constraint
    val firstSet = strs[0].toCharArray()

    var firstSetValue = 0
    var isFirstSetValueAddsUpToEven = false
    firstSet.forEach {
        firstSetValue += it.digitToInt()
    }
    isFirstSetValueAddsUpToEven = firstSetValue % 2 == 0

    //Check for the Third Constraint
    val secondSet = strs[1].toCharArray()
    var secondSetValue = 0
    var isSecondSetValueAddsUpToOdd = false
    secondSet.forEach {
        secondSetValue += it.digitToInt()
    }
    isSecondSetValueAddsUpToOdd = secondSetValue % 2 != 0

    //Check for the Fourth Constraint
    var isLastDigitIsGreaterInEachSet: Boolean = false
    for (i in 0..strs.lastIndex) {
        for (j in 0 .. strs[i].length){
            if(j+1 < strs[i].length)
                isLastDigitIsGreaterInEachSet = strs[i][j] <= strs[i][j+1]
        }
    }

    return if(isSerialNumber && isFirstSetValueAddsUpToEven && isSecondSetValueAddsUpToOdd && isLastDigitIsGreaterInEachSet){
        "true"
    }else{
        "false"
    }

}

/*fun VowelCount(str: String): String {

    var count = 0

    val stringToCharArray = str.toCharArray()

    stringToCharArray.forEach { alphabet ->
        if(
            alphabet.lowercaseChar() == 'a' ||
            alphabet.lowercaseChar() == 'e' ||
            alphabet.lowercaseChar() == 'i' ||
            alphabet.lowercaseChar() == 'o' ||
            alphabet.lowercaseChar() == 'u'
        ){
            count++
        }
    }

    return count.toString()

}*/



