fun operacao(a: Int, b: Int, c: String) {

    /*when (c) {
        "Soma" -> return a + b
        "Subtração" -> return a + b
        "Multiplicação" -> return a + b
        "Divisão" -> return a + b
        else -> {
            return 0
        }
    }*/
    when {
        a > 0 && b> 0 -> {
            println("Variaveis maiores que zero")
        }
    }

//    Range - Intervalo de valores ( .. )  Ex: 1..99
    when {
        a in 1..99 && b > 0 -> {
            println("Seculo")
        }
    }
}

fun main() {
    operacao(10, 10, "Soma")
}