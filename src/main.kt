class Pessoa {
    lateinit var nome: String

    fun geradorDeNome() {
        nome = "dfdjgire"
    }

}

fun main() {

    val p = Pessoa()
    p.geradorDeNome()

}