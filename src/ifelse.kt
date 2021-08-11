fun calculaBonus1(a: Int, b: Int, c: Int) {
    println("O bônus é de: ${a + b * c}")
}

// if - else
fun maiorDeIdade(idade: Int) {
    if (idade >= 18) {
        println("Maior de idade!")
    } else {
        println("Não é maior de idade!")
    }
}

//Enxutando o codigo
fun maiorDeIdade1(idade: Int): Boolean {
    return idade >= 18
}


fun main() {

    maiorDeIdade(10)
    maiorDeIdade(18)
    maiorDeIdade(27)
    maiorDeIdade1(10)
    maiorDeIdade1(18)
    maiorDeIdade1(27)

}