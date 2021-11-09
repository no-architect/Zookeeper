fun main() {
    
    val N = readLine()!!.toInt()
    val arrayN = IntArray(N)

    for (i in 0..arrayN.lastIndex) {
        arrayN[i] = readLine()!!.toInt()
    }

    var maxInd = 0
    var maxEl = arrayN[0]

    for (i in 1..arrayN.lastIndex) {
        if (maxEl < arrayN[i]) {
            maxInd = i
            maxEl = arrayN[i]
        }
    }
    println(maxInd)
}
