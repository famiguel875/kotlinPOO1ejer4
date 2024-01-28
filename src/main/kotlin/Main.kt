fun main() {

    val coche1 = Coche("Rojo", "Toyota", "corolla", 120, 4, "1234567")
    val coche2 = Coche("Azul", "Ford", "focus", 90, 5, "9876543")

    println(coche1)
    println(coche2)

    coche1.setColor("Verde")
    println("Color modificado: ${coche1.getColor()}")
    /**
    Intentar modificar atributos con valores inválidos
    Intentar modificar con la marca/modelo nulos o blancos
    coche1.marca = "" // No compila

    Intentar modificar con el número de caballos fuera del rango
    coche1.numCaballos = 800 // No compila

    Intentar modificar con el número de puertas fuera del rango
    coche1.numPuertas = 2 // No compila

    Intentar modificar con la matrícula con un tamaño incorrecto
    coche1.matricula = "123456" // No compila

    Intentar modificar con color nulo
    coche1.color = null // No compila
    */
}