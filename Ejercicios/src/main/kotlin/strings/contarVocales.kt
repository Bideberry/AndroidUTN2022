/*
Escribir una función contarVocales(), de tipo Int, que:
●solicite al usuario un texto
●retorne la cantidad de vocales de ese texto
●P. ej. la cantidad de vocales de esta consigna,
incluyendo el título, es de 75
*/
package strings

fun contarVocales(texto: String): Int{
    var cantidad = 0
    for (caracter in texto){
        when(caracter){
            'a','e','i','o','u' -> cantidad += 1
            'á','é','é','ó','ú' -> cantidad += 1
        }
    }

    println("Contando... \t BEEP...\t BEEP...\tBEEP...")
    print("Completado! La cantidad de vocales en el texto es $cantidad")
    return cantidad
}