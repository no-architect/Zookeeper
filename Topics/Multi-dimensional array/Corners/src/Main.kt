fun main() {
    // Do not touch code below
    var inputArray: Array<Array<String>> = arrayOf()
    val n = readLine()!!.toInt()
    for (i in 0 until n) {
        val strings = readLine()!!.split(' ').toTypedArray()
        inputArray += strings
    }
    // write your code here
    println("${ inputArray.first()[0]} ${inputArray.first()[inputArray.first().lastIndex]}")
    println("${ inputArray.last()[0]} ${inputArray.last()[inputArray.last().lastIndex]}")
}
