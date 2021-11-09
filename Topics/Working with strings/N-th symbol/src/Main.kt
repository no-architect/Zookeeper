fun main() {
    // write your code here
    val str = readLine()!!.toString()
    val num = readLine()!!.toInt()

    println("Symbol # $num of the string \"$str\" is \'${str[num - 1]}\'")
}
