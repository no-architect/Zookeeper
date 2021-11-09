import java.util.*

fun main() {
    // write your code here
    val scanner = Scanner(System.`in`)
    val numM = scanner.nextInt()
    val weekend: Boolean = scanner.nextBoolean()

    println(if (!weekend) (numM in 10..20).toString() else (numM in 15..25).toString())
}