package collections

fun main(args: Array<String>) {

//    List - Array, Set, Hashmap

    val l1 = listOf<String>("Madri", "São Paulo", "Berlim")
    val l2 = mutableListOf<String>("Madri", "São Paulo", "Berlim")

    val a1 = arrayListOf("Madri", "São Paulo", "Berlim") // é mutavel

    val s1 = setOf("Madri", "São Paulo", "Berlim", "Berlim") // Verifica se existem itens repetidos
    val s2 = mutableSetOf("Madri", "São Paulo", "Berlim", "Berlim")

    val h1 = hashMapOf<String, String>(Pair("key", "value"), Pair("França", "Paris")) // é mutavel

    val m1 = mapOf(Pair("key", "value"), Pair("França", "Paris"))
    val m2 = mutableMapOf(Pair("key", "value"), Pair("França", "Paris"))

}