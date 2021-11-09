class SomeCollection<T>(val list: List<T>) {
    // write your code here
    fun invert() {
        val pr = list.reversed()
        println(pr.toString())
    }
}