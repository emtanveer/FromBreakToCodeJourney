package Miscellaneous

fun String.capitalizeWords(): String {
    return split(" ").map {
        it.capitalize()
    }.joinToString(" ")
}

fun IntArray.printArray(): Unit {
    return forEach {
        print("$it ")
    }
}