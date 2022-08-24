/*Crear una función promedio(), de tipo Float, que:
 solicite al usuario numeros enteros para sumar
 deje de solicitar y sumar números cuando el usuario ingrese un String vacio o null
 retorne el promedio de todos esos enteros*/
package sumas

/*
* suma N números y muestra en pantalla el promedio
*  */
fun promedio():Float{

    println("Ingrese números enteros en forma consecutiva:")

    var suma = 0f
    var numeroIngresado: Int? = numcheck2()
    var cantidad = 0
    while (numeroIngresado != null) {
        suma += numeroIngresado
        cantidad += 1
        numeroIngresado = numcheck2()
    }

    println("Sumando... \t BEEP...\t BEEP...\tBEEP...")
    print("Completado! El promedio de los $cantidad números ingresados es: ${suma/cantidad}")
    return suma/cantidad
}


