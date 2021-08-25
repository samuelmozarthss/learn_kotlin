//Polimorfismo -> Algo que assume varias formas
interface Funcionario {
    fun calculaBonus()
}

class Gerente : Funcionario {
    override fun calculaBonus() {
        println("Bonus: 500")
    }

}

class Tecnico : Funcionario {
    override fun calculaBonus() {
        println("Bonus: 200")
    }

}

fun main() {

    val f1: Funcionario = Gerente()
    val f2: Funcionario = Tecnico()

}

fun calculo(funcionario: Funcionario) {
    funcionario.calculaBonus()
}