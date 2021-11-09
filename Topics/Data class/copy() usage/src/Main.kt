// do not change this data class
data class Box(val height: Int, val length: Int, val width: Int)

fun main() {
    // implement your code here
    val b1 = Box(readLine()!!.toInt(), readLine()!!.toInt(), 0)
    val b2 = b1.copy(length = readLine()!!.toInt(), width = readLine()!!.toInt())
    val b3 = b2.copy(length = b1.length)
    println(b3)
    println(b2)
}