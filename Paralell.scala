object Parallel{
    def main(args: Array[String]){
        val initP = System.nanoTime

        val lastNames = List("Smith","Jones","Frankenstein","Bach","Jackson","Rodin").par
        // println(lastNames)
        val lista = lastNames.map(_.toUpperCase)
        val endP = System.nanoTime
        println("Paralelo tiempo en nanosegundos: " + (endP - initP))

        //Al ser un dato tipo val no es mutable -.- 
        
        println(lista)
        println("-----Secuencial------")
        val initS = System.nanoTime

        val apellidos = List("Smith","Jones","Frankenstein","Bach","Jackson","Rodin")
        val apellidos2 = apellidos.map(_.toUpperCase)
        val endS = System.nanoTime

        println(apellidos2)
        println("Tiempo secuencial en nanosegundos: " + (endS - initS))

        val list = (1 to 100000).toList


        val initPp = System.nanoTime
            list.map(_ + 42)
        val endPp = System.nanoTime
        println("Secuential@@ Tiempo list +42 en nanosegundos: " + (endPp - initPp))


        val initPP = System.nanoTime
            list.par.map(_ + 42)
        val endPP = System.nanoTime
        println("Parallel@@ Tiempo list +42 en nanosegundos: " + (endPP - initPP))



    
    
    }
}