enum class Prioridade1 {
    BAIXA, MEDIA, ALTA
}
//override sobrescrita
enum class Prioridade2(val id: Int) {
    BAIXA(1), MEDIA(5), ALTA(10)
}

class Alarme(var desc: String, p: Prioridade2)

fun main() {

//    Alarme("Aviso!", Prioridade2.Alta

    for (p in Prioridade2.values()) {
        println("$p - ${p.id} - ${p.ordinal}")
    }
}