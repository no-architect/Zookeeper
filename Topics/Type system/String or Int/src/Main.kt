fun isNumber(input: String):Any? // write this function
{
    var res: Any? = input.toIntOrNull()
    if (res == null) { res = input}
    return res
}