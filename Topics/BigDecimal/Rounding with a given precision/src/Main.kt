import java.math.BigDecimal
import java.math.RoundingMode

fun main() {             
    // write your code here
    val a = readLine()!!.toBigDecimal()
    val b = readLine()!!.toInt()
    val res = a.setScale(b, RoundingMode.HALF_DOWN)
    println(res)
}