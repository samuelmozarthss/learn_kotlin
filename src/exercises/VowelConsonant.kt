package exercises

fun countVowels (phrase: String): Int {
    val Volwes = "aeiou"
    var totalVowels = 0

    for (letras in phrase) {
        if(letras.lowercaseChar() in Volwes) totalVowels++
    }
    return totalVowels
}

fun countConsonants(phrase: String): Int {
    val Consonants = "bcdfghjklmnpqrstvwxyz"
    var totalConsonants = 0
    for (letras in phrase) {
        if (letras.lowercaseChar() in Consonants) totalConsonants++
    }
    return totalConsonants
}

fun countVowelsAndConsonants (phrase: String): Int {
    return 0
}