/* Se implementa la funcion del ejercicio 1 */

def time(speed: Double): Double = 
    val distance = 42.19
    val duration = distance / speed
    val minutes = duration * 60

time(12)

time(14)

def timeName(speed: Double, nombre: String): Double = 
    val distance = 42.19
    val duration = distance / speed
    val minutes = duration * 60
    // val impresion = nombre + " corrió en tantos minutos " + minutes


timeName(12,"Alice")
timeName(14, "Bob")