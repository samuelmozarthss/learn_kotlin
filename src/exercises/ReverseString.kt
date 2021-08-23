package exercises

fun reverseUsingSB(str: String): String {
    return StringBuilder(str).reverse().toString()
}

fun reverseUsingLoop(str: String): String {
    var sbFrase = StringBuilder()
    var i = str.length - 1

    while (i >= 0) {
//        append insere coisas
        sbFrase.append(str[i])
        i--
    }
    return sbFrase.toString()
}