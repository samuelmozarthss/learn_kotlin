//Algumas palavras são reservadas da linguagem e a IDE irá notificar

//Função  - Nome   -   Parametros/Variaveis - Retorno
//   │        │                 │               │
//   v        v                 v               v
/*  fun calculaBonus(a: Int, b: Int, c: Int) : Int {
      println("O bônus é de: ${a + b * c}")
    }
*/

fun calculaBonus(a: Int, b: Int, c: Int){
    println("O bônus é de: ${a + b * c}")
}

fun hello(nome: String) : String {
    return "Olá, $nome"
}
//Função de uma so Linha:
fun hello2(nome: String) = "Olá, $nome"


//Exercicio de função de uma linha
fun soma (a: Int, b: Int) : Int {
    return a+b
}
fun soma2 (a: Int, b: Int) = a + b
//Fim exercicio

fun main() {

    val a = 10
    val b = 20
    val c = 30

    calculaBonus(a, b, c)

    ////

    println(hello("Samuel"))

}