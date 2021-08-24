//Open diz que a classe pode ser herdada

open class Maquina1 (val marca: String) {
    open fun minhaMarca() {
        println("Minha marca é $marca")
    }
}

class Computador(marca: String, val nucleos: Int): Maquina1(marca) {

//    override -> sobrescrever ->  passa
    override fun minhaMarca() {
        println("Estou reescrevendo minha marca!!")
        super.minhaMarca()
    }

//    overload -> sobrecarca -> Metodos com o mesmo nome mas com tipos e ou quantidades de parametros diferentes
    fun overload(i: Int) = println("Overload 1")
    fun overload(i: String) = println("Overload 2")
    fun overload(i: Boolean) = println("Overload 3")

    private fun validate() {

    }

    fun ligar() {}
    fun processar() {}

}

fun main() {

    val c: Computador = Computador("xpto", 10)
    with(c) {
        ligar()
        processar()
        minhaMarca()

        overload(10)
        overload("")
        overload(false)
    }


}