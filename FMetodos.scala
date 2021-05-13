
//Función
(x: Int) => x + 1
//parametros a la izquierda 

val funcion1 = (y:Int) => y + 1
//Se imprime el resultado de funcion1(3) 
println(funcion1(3))

//Función con varios parametros
val suma = (s1:Int, s2:Int) => s1 + s2
println(suma(2,2))

//Función que no recibe parámetros
val caracolaMagica = () => "No"

println(caracolaMagica())

/* Comentarios de varias lineas
-------------------------------
*/

/*------------Métodos--------------*/

//Los métodos se definen con la palabra reservada *def*

/*
def suma(p1:Int,p2:Int): Int = p1 + p2
println(suma(1,2))
*/

def sumaM(p1:Int,p2:Int): Int = p1 + p2
println("El resultado del método sumaM es: " + sumaM(1,2))

/* No puede haber una función y un método con el mismo nombre
y el mismo número de parámetros que recibe, sería ambiguo */

//Un método puede tener varias listas de parámetros 
def potencia(base:Int)(exponente:Int): Double = Math.pow(base,exponente)
println("Método cuadrado " + potencia(2)(2))

def name: String = System.getProperty("user.name")
println("Hello, " + name + "!")