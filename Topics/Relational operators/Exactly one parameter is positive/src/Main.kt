fun main() {
    // put your code here
    val n1 = readLine()!!.toInt()
    val n2 = readLine()!!.toInt()
    val n3 = readLine()!!.toInt()

    var res: Int = if (n1 > 0) 1 else 0
    res += if (n2 > 0) 1 else 0
    res += if (n3 > 0) 1 else 0
    println(res == 1)
}