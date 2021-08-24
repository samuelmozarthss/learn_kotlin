//Interface efine as operações que um objeto será obrigado a implementar.
interface Maquinaa {
    fun ligar()
    fun desligar(){
        println("off")
    }
}
class Computadoor(): Maquinaa {
    override fun ligar() {
        TODO("Not yet implemented")
    }

    override fun desligar() {
        super.desligar()
    }
}

interface interface1 {
    fun ola() {
        println("interface1")
    }
}
interface interface2 {
    fun ola() {
        println("interface2")
    }
}

class ImplementaInterface : interface1, interface2 {
    override fun ola() {
        super<interface1>.ola()
    }



}

fun main() {

}