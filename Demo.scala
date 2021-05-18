object Demo {
   def main(args: Array[String]) {
      var floatVar = 12.456
      var intVar = 2000
      var stringVar = "Hello, Scala!"
      
      var fs = printf("The value of the float variable is " + "%f, while the value of the integer " + "variable is %d, and the string" + "is %s", floatVar, intVar, stringVar);
      
      println(fs)

      //Forma uno de imprimir el resultado de un metodo
      var tiempo = time(14.0)
      println(tiempo)
      //Forma dos de imprimir el resultado de un metodo
      println(time(14.0))

      // Dos formas distintas de pasar parametros

      // 1.- 
      println(timeName(speed = 12, nombre = "Alice"))
      // 2.-
      val timeNam = timeName(12,"Alice")
      println("Segundo timeName: " + timeNam)

      //No puede haber una variable con nombre X, a la que se le asigne el valor de una función tambien llamada X
   }

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
}