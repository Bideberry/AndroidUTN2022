package sumas

fun main(){
    println("¿Qué ejercicio vamos a probar hoy?")
    val ejercicio: Int = numcheck()

    when (ejercicio){
        1 -> {

            println("Ingrese 5 números enteros en forma consecutiva:")
            suma1()
        }
        2 -> {
            println("Bienvenido a la función 'suma N'")
            println("¿Cuantos números quiere sumar?")
            val n = numcheck()
            suma2(n)
            println("Ingrese $n números enteros en forma consecutiva:")
        }
        3 -> {
            println("Bienvenido a la función 'suma endless'")
            println("Ingrese numeros a sumar y por último presione enter")
            suma3()
        }
        4 -> {
            println("Bienvenido a la función 'promedio'")
            println("Ingrese numeros a calcular el promedio y por último presione enter")
            promedio()
        }
        else -> println("El ejercicio indicado no existe o no se ha realizado aún")
    }

}