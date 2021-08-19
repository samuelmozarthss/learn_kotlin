import java.lang.Exception

fun main() {

    try {
        println("afsdf".toInt())
    }
//    NumberFormatException para excessões especificas
    catch (e: NumberFormatException) {
        println("Esse valor não é um numero")
    }
    catch (e: Exception) {
        println("Algo deu ruim, irmão!")
    }
//    No finally é feito o tratamento da excessão
    finally {
        println(" Agora deu")
    }



}