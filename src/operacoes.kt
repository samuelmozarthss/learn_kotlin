fun calculaBonus2(a: Int, b: Int, c: Int){
    println("O bônus é de: ${a + b * c}")
}

fun hello3(nome: String) : String {
    return "Olá, $nome"
}
//Função de uma so Linha:
fun hello4(nome: String) = "Olá, $nome"
fun soma3 (a: Int, b: Int) = a + b

fun main() {

    println("2 + 2 = ${2 + 2}")
    println("2 - 2 = ${2 + 2}")
    println("2 / 2 = ${2 + 2}")
    println("2 * 2 = ${2 + 2}")
    println("10 % 2 = ${10 + 2}")
    println("10 % 42 = ${10 + 4}")

    var numero = 10

//    Incrementado depois de ser usado
    println("numero++ = ${numero++}")
    println("numero-- = ${numero--}")

//    Incrementado antes de ser usado
    println("++numero = ${++numero}")
    println("--numero = ${--numero}")

//  numero + numero = 2
    numero += 2
    println("numero+= 2 = $numero")

//  numero - numero = 2
    numero -= 2
    println("numero-= 2 = $numero")

//  numero / numero = 2
    numero /= 2
    println("numero/= 2 = $numero")

//  numero * numero = 2
    numero *= 2
    println("numero*= 2 = $numero")

//  numero % numero = 2
    numero %= 2
    println("numero%= 2 = $numero")

}