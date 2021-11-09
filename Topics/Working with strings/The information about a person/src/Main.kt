import java.util.*

fun main() {
    // put your code here
    val scanner = Scanner(System.`in`)
    val firstName = scanner.next()
    val lastName = scanner.next()
    val age = scanner.nextInt()

    println("${firstName[0]}. $lastName, $age years old")
}