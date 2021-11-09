fun main() {
    // put your code here
    val distance = readLine()!!.toDouble()
    val time = readLine()!!.toDouble()

    if (time > 0 && distance > 0) { println(distance / time) } else { println("no result") }
}
