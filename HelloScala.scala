// Start writing your ScalaFiddle code here
println("Hello Scala")

println(1+1)

val name = "Andy"
println("Holi " + name + "! ")

// val <nombre de la variable> : <Tipo de variable> = <Valor>
val name1: String = "Usando String"

println(name)

val prod1 = 2
println("Multiplicación de 4 por "+ prod1 + " es igual a " + 4 * prod1)

//Un bloque a continuación

println({
  val variable1: Int = 12 + 31416   //una variable de tipo Int igual a una suma
  variable1 - 12                    // Se resta 12 a variable1
}) // imprime 31416

println({
  val nombre: String = "Andrea"
  nombre + " seudonimo: Ummyers"
  nombre + " aprendiendo Scala " //Imprimira lo indicado en la ultima linea del bloque
})

val nombre = "Fernanda"
// Obteniendo el longitud de un String
var longitud = nombre.length();
println(longitud)

//Concatenar dos string
val apellido = " Myers"
println("Se imprime la concatenación usando función concat")
println(nombre.concat(apellido))
val nomCompleto = nombre.concat(apellido)
println("Se imprime variable nomCompleto")
println(nomCompleto)

var floatVar = 12.456
var intVar = 2000

var fs = "Imprimir variables -> \n" + "floatVar:" + floatVar
    
println(fs)
