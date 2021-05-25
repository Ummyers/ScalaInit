
object Tuples{
    def main(args: Array[String]){
        //Al igual que las listas las tuplas son inmutables
        val vectorV = (2,3)
        val vectorU = (2,2)
        //Imprime la primer entrada del vectorU
        println(vectorU._1)
        //La tubla puede ser de tipos distintos; ejemplo

        val pair = (24, "June")
        // el punto invoca el método el guión bajo indica cual parametro quieres
        println(pair._2)

        //-------Tuplas de distintos tipos----------
        val tupla = ("Andrea", 25, 1997, "Guada")
        println(tupla)

        //Swap en tuplas
        val tuple = ("apple", 3).swap
        println(tuple)

        val lista = List(1,2,3)
        println(lista.tail)

        val d = Nil
            val c = 3 :: d
            val b = 2 :: c
            val a = 1 :: b

            println(a.tail)
            println(b.tail)
            println(c.tail)

    }
}