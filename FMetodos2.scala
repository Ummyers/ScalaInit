/* Se implementa la funcion del ejercicio 1 */

def time(speed: Double): Double = {
    // 
    val distance = 42.195
    val duration = distance / speed
    duration * 60
}

def timeName(speed: Double, nombre: String): String = { 
    val distance = 42.19
    val duration = distance / speed
    nombre + " " + duration * 60
}
time(12.2)
time(14.5)

timeName(12.6,"Alice")
timeName(14.6, "Bob")