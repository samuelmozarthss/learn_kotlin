//           Valor neutro direto no parametro
//                           V
fun endereco (rua: String = "", cidade: String, estado:String, cep: String) {
    println("Rua: $rua")
    println("Cidade: $cidade, $estado - $cep")
}

fun main() {
//    Trazendo valores fora da sequência logica dos parametros
//                                V
    endereco(cidade = "Brasilia", estado = "DF", cep = "13")
    endereco(cep = "13", cidade = "Brasilia", estado = "DF")
    endereco(cidade = "Brasilia", estado = "DF", cep = "13")

}