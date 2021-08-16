fun main() {
// For - loop
// Loop infinito

    val str = "Samuel"
//    str.length
    for (c in str) {
//        println("$c ")
    }

//              De dois em dois
//                     V
    for (i in 0..100 step 10) {
        if (i != 80) {
            print("$i - ")
        } else {
            println(" Aqui não carai - ")
        }
    }

    for (j in 100 downTo 0) {
        print("$j - ")
    }

}