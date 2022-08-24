/*
* Crear una función suma1(), de tipo entero, que:
*   solicite al usuario 5 enteros
*   retorne la suma de esos enteros
*  */
package sumas
/*
* suma 5 números y muestra en pantalla el resultado
*  */
fun suma1 (): Int {
    var suma = 0
    for (i in 1..5){
        suma += numcheck()

        when{
            i < 5 -> println("Ingrese un nuevo valor. Faltan ${5-1} números")
            i == 5 -> println("Ingrese un nuevo valor. Falta un número")
        }

    }

    println("Sumando... \t BEEP...\t BEEP...\tBEEP...")
    print("Completado! La suma de los 5 números es: $suma")
    return suma
}

