class MyStack<T>(data: List<T>) {
    val items = data.toMutableList()

    //implement methods
    fun push(data: T) { 
        items.add(data)
    }

    fun pop(): T { 
        val del = items.last()     
        items.remove(items.last())
        return del
    }
}
