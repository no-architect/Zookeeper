fun reverse(input: Int?): Int {
    val res: Int

    if (input == null) {res = -1}
    else
    {
        val resStr = input!!.toString()
        val resRevStr = resStr.reversed()
        res = resRevStr.toInt()
    }

    return res
}