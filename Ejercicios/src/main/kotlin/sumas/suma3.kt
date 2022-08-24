/*
* Crear una función suma3(), de tipo entero, que:
*  solicite al usuario numeros enteros para sumar
*  deje de solicitar y sumar números cuando el usuario ingrese un String vacio o null
*  retorne la suma de todos esos enteros
*  */
package sumas

/*
* suma N números y muestra en pantalla el resultado
*  */
fun suma3 (): Int{
    var suma = 0
    var numeroIngresado: Int? = numcheck2()
    var cantidad = 0
    while (numeroIngresado != null) {
        suma += numeroIngresado
        cantidad += 1
        numeroIngresado = numcheck2()
    }

    println("Sumando... \t BEEP...\t BEEP...\tBEEP...")
    print("Completado! La suma de los $cantidad números ingresados es: $suma")
    return suma
}

