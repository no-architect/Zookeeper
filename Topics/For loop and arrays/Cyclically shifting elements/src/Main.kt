fun main() {
    // write your code here
    val arrayA = IntArray(readLine()!!.toInt()) { readLine()!!.toInt() }
    val lastA = arrayA[arrayA.lastIndex]

    for (i in arrayA.lastIndex downTo 1) {
        arrayA[i] = arrayA[i - 1]
    }
    arrayA[0] = lastA

    println(arrayA.joinToString(" "))
}