fun main() {
    // write your code here
    val numFind = readLine()!!.toInt()

    val range1Start = readLine()!!.toInt()
    val range1End = readLine()!!.toInt()

    val res: Boolean = numFind in range1Start..range1End

    println(res)
}