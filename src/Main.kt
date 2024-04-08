//espero que não tenha problema fazer assim

fun main() {
    var i = 1
    i = Contar(i)
    Exerc1()
    i =Contar(i)
    Exerc2()
    i =Contar(i)
    Exerc3()
    i =Contar(i)
    Exerc4()
    i =Contar(i)
    Exerc5()
    i =Contar(i)
    Exerc6()
    i =Contar(i)
    Exerc7()
}
fun Exerc1() {
        println("1")
        println("2")
        println("3\n")
}

fun Exerc2() {
    println("I'm")
    println("learning")
    println("Kotlin!\n")
}

fun Exerc3() {
    println("Monday")
    println("Tuesday")
    println("Wednesday")
    println("Thursday")
    println("Friday\n")
}

fun Exerc4() {
    println("Tomorrow is rainy\n")
}

fun Exerc5() {
    println("There is a chance of snow\n")
}

fun Exerc6() {
    println("Cloudy")
    println("Partly Cloudy")
    println("Windy\n")
}

fun Exerc7() {
    println("How's the weather today?\n")
}

fun Contar(i: Int): Int {
    println("exerc$i")
    return i + 1
}
