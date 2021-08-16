fun calculaBonus1(a: Int, b: Int, c: Int) {
    println("O bônus é de: ${a + b * c}")
}

fun calculaBonus3(cargo: String, salario: Float): Float {

//    Gerente Junior, Gerente Senior, Coordenador
    return if (cargo == "Coordenador") {
        salario * 0.2f
    } else if (cargo == "Gerente Junior") {
        salario * 0.5f
    } else {
        salario * 2
    }

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

    println(calculaBonus3("Coordenador", salario = 1000f))
    println(calculaBonus3("Gerente Junior", salario = 1000f))
    println(calculaBonus3("Gerente Senior", salario = 1000f))

}