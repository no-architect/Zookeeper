class QuizBox <T> (_item: T) {
    var isChanged = false
    var item: T = _item

    //implement methods
        fun get(): T {
            println("You asked for the item" )
            return item
        }

        fun set(value: T) {
            println("You changed the item")
            item = value
            isChanged = true
        }
}
