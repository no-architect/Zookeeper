fun main() {
    // write your code here
    val arrN = IntArray( readLine()!!.toInt()) { readLine()!!.toInt() }
    val indStop = arrN.lastIndex - 2
    var countTrip = 0

    for (i in 0..indStop) {
        if (arrN[i] + 1 == arrN[i + 1] && arrN[i + 1] + 1 == arrN[i + 2]) { countTrip++ }
    }

    println(countTrip)
}