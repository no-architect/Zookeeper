fun main() {
    // write your code here
    val N = readLine()!!.toInt()
    val arrayN = IntArray(N)

    for (i in 0..arrayN.lastIndex) {
        arrayN[i] = readLine()!!.toInt()
    }
    val M = readLine()!!.toInt()
    var res = false
    for (i in 0..arrayN.lastIndex) {
        if (M == arrayN[i] && res == false) {
            res = true
        }
    }
    println(if (res) "YES" else "NO")
}