//Mamifero - Animal
// Classe abstrata não pode ser instanciada, porem, pode definir comportamentos que outras classes irão herdar
//É um tipo de classe que somente pode ser herdada e não instanciada.
abstract class Mamifero(var nome: String) {

    var peso: Float = 0f

    abstract fun falar()
    open fun dormir() {
        println("Estou dormindo!")
    }
    fun passear() {
        println("Quero passear!")
    }
}

class Cachorro(nome: String, peso:Float) : Mamifero(nome) {

    init {
        this.peso = peso
    }

    override fun falar() {
        println("au au")
    }

}

class Gato(nome: String) : Mamifero(nome) {
    override fun falar() {
        println("miau")
    }

    override fun dormir() {
        println("dormir 3hrs")
        super.dormir()
    }

}

fun main() {
    Cachorro("Bolt",10f).dormir()
//    Cachorro("Bolt").passear()

}