import java.math.BigDecimal
import java.math.RoundingMode     

fun main() {
    // write your code here
    val (a, b) = List(2) { readLine()!!.toInt()}
    val c = readLine()!!.toBigDecimal()

    val c_round = c.setScale(b, RoundingMode.DOWN)
    val c_pow = c_round.pow(a)
    println(c_pow)

}