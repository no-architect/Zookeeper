fun main() {

    val numbers = readLine()!!.split(' ').map { it.toInt() }.toMutableList()
    val mutList: MutableList<Int> = mutableListOf()
    // do not touch the lines above
    // write your code here   
    val valSum = numbers.sum()
    val index = numbers.size - 2

    mutList.add(valSum)
    for (index in 1 until numbers.lastIndex) {
        mutList.add(numbers[index - 1])
    }
    mutList.add(numbers.last())
    
    // do not touch the lines below
    println(mutList.joinToString(" "))
}
