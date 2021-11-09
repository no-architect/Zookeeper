fun main() {
    // write your code here
    val size = readLine()!!.toInt()
    val company = IntArray(size) { readLine()!!.toInt() }
    val percent = IntArray(size) { readLine()!!.toInt() }

    var indMax = 0
    var valMax = company[indMax] * percent[indMax]
    for (i in 1..company.lastIndex) {
        val valCur = company[i] * percent[i]
        if (valCur > valMax) {
            indMax = i
            valMax = valCur
        }
    }
    println(indMax + 1)
}
