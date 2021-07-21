fun main(args: Array<String>) {

    val list: List<Int> = listOf(7,9,5,8,4,3)
    println(reverseDigit(list))
}

fun reverseDigit(list: List<Int>): List<Int>{
    val result: ArrayList<Int> = arrayListOf<Int>()
    for (i: Int in list.size-1 downTo 0){
        result.add(list[i])
    }
    return result

}