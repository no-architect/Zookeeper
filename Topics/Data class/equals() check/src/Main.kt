data class Client(val name: String, val age: Int, val balance: Int) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Client

        if (name != other.name) return false
        if (age != other.age) return false

        return true
    }
}

fun main() {
    //implement your code here
    val a = Client( readLine()!!, readLine()!!.toInt(), readLine()!!.toInt())
    val b = Client( readLine()!!, readLine()!!.toInt(), readLine()!!.toInt())
    println(a.equals(b))
}