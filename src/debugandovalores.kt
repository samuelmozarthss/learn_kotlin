fun meuNome (nome: String) {
    println("Olá $nome!")
}

fun meuNomeIdade(nome: String, idade: Short) {
    println("Olá $nome! Tenho $idade anos.")
}

fun letraIndice (nome: String, indice: Int) : Char{
    return nome[indice]
}

fun main() {
    meuNome("Samuel")
    meuNomeIdade("Samuel",24)
    letraIndice("Samuel", 3)

    val str = "ebcf"
}