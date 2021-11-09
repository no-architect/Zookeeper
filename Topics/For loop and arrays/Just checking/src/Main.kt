fun main() {
    // write your code here
    val numN = readLine()!!.toInt()
    val arrayN = IntArray(numN)

    for (i in 0..arrayN.lastIndex) {
        arrayN[i] = readLine()!!.toInt()
    }

    val (numP, numM) = readLine()!!.split(" ").map { it.toInt() }

    var entryP = false
    var entryM = false

    for (i in 0..arrayN.lastIndex) {
        if (numP == arrayN[i]) { entryP = true }
        if (numM == arrayN[i]) { entryM = true }
    }

    println(if (entryM && entryP) "YES" else "NO")
}
