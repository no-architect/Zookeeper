fun main() {
    // write your code here
    val range1Start = readLine()!!.toInt()
    val range1End = readLine()!!.toInt()
    val range2Start = readLine()!!.toInt()
    val range2End = readLine()!!.toInt()
    val numFind = readLine()!!.toInt()

    val res: Boolean = numFind in range1Start..range1End || numFind in range2Start..range2End

    println(res)
}