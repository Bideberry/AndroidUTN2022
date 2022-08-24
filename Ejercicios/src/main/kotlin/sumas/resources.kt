package sumas

/*
* Verifica que el valor ingresado sea un número y sino te caga a pedos
*  */
fun numcheck (): Int {
    val nuevoNumero = readln()
    val ret: Int = try {
        nuevoNumero.toInt()
    }
    catch (e: NumberFormatException){
        println("El valor ingresado no corresponde. Intente nuevamente:")
        numcheck()
    }
    return ret
}

/*
* Verifica que el valor ingresado sea un número y sino te caga a pedos
*  */
fun numcheck2 (): Int? {
    val nuevoNumero = readln()

    if (nuevoNumero == ""){
        return null
    }

    val ret: Int? = try {
        nuevoNumero.toInt()
    } catch (e: NumberFormatException) {
        println("El valor ingresado no es un número. Intente nuevamente:")
        numcheck2()
    }

    return ret
}