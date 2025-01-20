package Miscellaneous

fun main(args: Array<String>) {

    //    fold vs reduce
//    val list = listOf(null, null, 1)
//    val abc = list.fold(0) { sum, element -> sum + element!! }
//    println("result: $abc")

    //    Twice as Old
//   val toTest = Test().twiceAsOld(50,24)
//   println("result: $toTest")


}

public class Test {

    // Twice As Old
    fun twiceAsOld(dadYearsOld: Int, sonYearsOld: Int): Int {
        return Math.abs(dadYearsOld - (sonYearsOld * 2))
    }



}
