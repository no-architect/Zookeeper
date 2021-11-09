fun parseCardNumber(cardNumber: String): Long {
    val reg = """\d{4} \d{4} \d{4} \d{4}""".toRegex()
    if (reg.matches(cardNumber)) {
        return cardNumber.replace(" ", "").toLong()
    }
    else { throw Exception("Card number is incorrect") }
}
