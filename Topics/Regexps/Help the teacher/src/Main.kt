fun main() {
    val report = readLine()!!
    //write your code here.
    var res = false
    for (i in 0..9) {
        if (report.matches(Regex("$i wrong answers?"))) { res = true }
    }
    println(res)
}
