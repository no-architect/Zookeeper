fun main() {
    // put your code here
    val totalDay = readLine()!!.toInt()
    val costFood = readLine()!!.toInt()
    val costFly = readLine()!!.toInt()
    val costHotel = readLine()!!.toInt()

    val res = totalDay * costFood + 2 * costFly + (totalDay - 1) * costHotel

    println(res)
}