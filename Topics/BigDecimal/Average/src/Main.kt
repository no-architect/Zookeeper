
import java.math.BigDecimal
import java.math.RoundingMode

fun main() {
    // write your code here
    val (a, b, c) = List(3) { readLine()!!.toBigDecimal() }
    val kol = 3.toBigDecimal()
    val res = (a + b + c) / kol

    println(res.setScale(0, RoundingMode.DOWN))

}
