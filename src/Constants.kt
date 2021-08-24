//Fechamento do construtor da classe
//                      V
class Constants private constructor(){

//    Não necessita de um nome
//           V
    companion object {
        val TABLE = "Pessoa"

        fun teste() {
            println("Sou um método estático!")
        }
    }
//    Necessita de um nome
//     V
    object VENDAS{

    }
}

fun main() {
    Math.sin(180.0)
    println(Constants.TABLE)
    Constants.teste()
}