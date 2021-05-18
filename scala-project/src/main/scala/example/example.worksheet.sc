1 + 1

val x = 42

x * x

val w = "Hola Mundo, desde Coursera"

3 + 14 

var r = x + w

"Hola mundo cruel".length

"¿Cuántas palabras tiene mi nombr?".length

//Multiplicas una cadena por un número
"holis " * 3

//Pasa a Mayúsculas
"Dumbo".toUpperCase

//Operaciones logicas 
true && false

true || false 

//Operaciones equivalentes
1 + 2 * 3
1.+(2.*(3))

val facade = 4 * 3
val door = 1 * 2
facade - door 

// -------------TYPES and DEFINITIONS------------------

// Int, String, Boolean, Double

//La identación indica lo que pertenece al metodo
def house(facade: Double, window: Double) = 
    facade - door - window * 2

house(2.3, 2.5)

//Metodo que recibe dos parámetros facede, window y devuelve un valor de tipo Double
def house2(facade: Double, window: Double): Double =
    val door = 2 * 1
    val subtractedArea = door + window * 2
    facade - subtractedArea
end house2
//Es opcional el indicar el termino de la "def" 

def house3(facade: Double, window: Double): Double = {
    val door = 2 * 4
    facade * door + window
}

/* Los val que se crean en un metodo no son visibles
* fuera de ellos
*/

//Por ejemplo

val tenSquared: Int =
    val ten = 10
    ten * ten

/* Se implementa la funcion del ejercicio 1 */

def time(speed: Int): Double =
    val distance = 42.195
    val duration: Double = distance / speed
    val minutes = duration * 60
end time 

time(12)

time(14)

def timeName(speed: Int, nombre: String): String =
    val distance = 42.195
    val duration: Double = distance / speed
    val minutes = duration * 60
    val nombre + " corrió en tantos minutos " + minutes
end timeName

timeName(12,"Alice")
timeName(14, "Bob")

