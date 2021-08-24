class Pessoa1

class Pessoa2 (var nome: String, var anoNascimento: Int)

class Pessoa3 (var nome: String) {

//    Se a variavel do construtor não for criada, ela não será visivel na chamada de valor
//       V
    var ano: Int? = null

    constructor(nome: String, ano: Int) : this(nome) {
        this.ano = ano
    }

    fun  saudacao() {
        println("Olá, meu nome é $nome")
    }
}

fun main() {



//    Trexo de codigo que é chamado quando a classe é instanciada
//             Aqui está instanciando o objeto
//                           V
    val p1: Pessoa3 = Pessoa3("Samuel", 1997)
    val p2: Pessoa3 = Pessoa3("Samuel")


    println(p1.nome)
    println(p1.ano)

    p1.saudacao()

    println(p2.nome)
    println(p2.ano)

    p2.saudacao()

}