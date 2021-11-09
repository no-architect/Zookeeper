import java.util.*

fun main() {
    // write your code here
    val scanner = Scanner(System.`in`)

    val hours = scanner.nextInt()
    val minutes = scanner.nextInt()
    val seconds = scanner.nextInt()
    val day = scanner.nextInt()
    val month = scanner.nextInt()
    val year = scanner.nextInt()
    println("$hours:$minutes:$seconds $day/$month/$year")
}