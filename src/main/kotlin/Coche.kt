class Coche(
    var color: String?,
    val marca: String,
    val modelo: String,
    val numCaballos: Int,
    val numPuertas: Int,
    val matricula: String
) {
    init {
        require(color != null) { "El color no puede ser nulo" }
        require(marca.isNotBlank()) { "La marca no puede ser nula o en blanco" }
        require(modelo.isNotBlank()) { "El modelo no puede ser nulo o en blanco" }
        require(numCaballos in 70..700) { "El número de caballos debe estar entre 70 y 700" }
        require(numPuertas in 3..5) { "El número de puertas debe estar entre 3 y 5" }
        require(matricula.length == 7) { "La matrícula debe tener 7 caracteres" }
    }

    fun getColor(): String? {
        return color
    }

    fun setColor(newColor: String) {
        require(newColor != null) { "El color no puede ser nulo" }
        color = newColor
    }

    override fun toString(): String {
        return "Coche [Color: $color, Marca: $marca, Modelo: ${modelo.capitalize()}, " +
                "Caballos: $numCaballos, Puertas: $numPuertas, Matrícula: $matricula]"
    }
}


