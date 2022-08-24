/*
* CCrear una función suma2(), de tipo entero, que:
*   solicite al usuario un numero N
*   solicite al usuario N numeros enteros
*   retorne la suma de esos N enteros
*  */
package sumas

/*
* suma N números y muestra en pantalla el resultado
*  */
fun suma2 (n: Int): Int{
    var cantidad = n
    var suma = 0
    while(cantidad > 0){
        suma += numcheck()

        cantidad --
        when{
            cantidad > 1 -> println("Ingrese un nuevo valor. Faltan $cantidad números")
            cantidad == 1 -> println("Ingrese un nuevo valor. Falta $cantidad número")
        }

    }

    println("Sumando... \t BEEP...\t BEEP...\tBEEP...")
    print("Completado! La suma de los $n números es: $suma")
    return suma
}
