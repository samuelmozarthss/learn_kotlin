/*
class Maquina (var marca: String)



fun main() {
 val p: Pessoa = Pessoa()
    p.nome

}*/

class Maquina (var marca: String) {

    var nucleos: Int = 0
    get() {
        println("Get foi chamado")
        return field
    }
    set(value) {
        println("Sett foi chamado")
        field = value
    }

    fun ligar() {

    }
    fun processar() {

    }
    fun desligar() {

    }

}

fun main() {
    var m = Maquina("xpto")
//    println(m.nucleos)
//    m.nucleos = 10

    with(m){
        ligar()
        processar()
        desligar()
    }
    m.ligar()
    m.processar()
    m.desligar()

}

