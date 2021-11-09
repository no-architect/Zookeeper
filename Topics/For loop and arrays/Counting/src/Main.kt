fun main() {
    // write your code here
    val (a, b, c) = List(3) { readLine()!!.toBigDecimal() }
    val res = a + b + c
    println(res)
}