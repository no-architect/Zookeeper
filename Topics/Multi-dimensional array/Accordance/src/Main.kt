fun main() {
    // put your code here
    val arrayOfString2D = arrayOf(
        arrayOf<String>("[0][0]", "[0][1]", "[0][2]"),
        arrayOf<String>("[1][0]", "[1][1]", "[1][2]")
    )
    println(arrayOfString2D.contentDeepToString())
}