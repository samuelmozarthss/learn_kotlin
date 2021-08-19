import java.util.*

fun media3 (vararg notas: Float) {

    if (notas.isNotEmpty()) {
        var soma = 0f
        for (nota in notas) {
            soma += nota
        }
        println("A média é: ${soma/notas.size}")
    }


}

fun endereco (rua: String = "") {
    
}

fun <T> media (vararg valores: T) {
    for (valor in valores) {
        println(valor)
    }
}

fun main() {

    media(8f, 9f)
    media(1f,9f, 8f, 9f)

    val str = "SamuelGostoso"
    str.replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() }
    str.contains("bla")
    str.startsWith("S")
    str.startsWith("s")

}