// implement your function here
fun <T> countItem(list: List<T>, item: T ): Int {
    var count = 0
    for (exm in list) {
        if (exm == item) count++
    }
    return count
}