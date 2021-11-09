fun main() {
    // put your code here
    val class1 = readLine()!!.toInt()
    val class2 = readLine()!!.toInt()
    val class3 = readLine()!!.toInt()

    println(class1/2 + class2/2 + class3/2 + class1%2 + class2%2 + class3%2)
}