/* Arreglo y Map
*
*/
import scala.collection.mutable

object Arreglo{
    def main(args: Array[String]){
        val numNames = Array("Zero","One", "Two")

        println(numNames(2))

        //Un map mutable
        val treasureMap = mutable.Map[Int,String]()
        treasureMap +=(1 -> "America")
        treasureMap +=(2 -> "Cruz Azul")
        println(treasureMap(2))

        //Map inmutable
        val romanNumeral = Map(
            1 -> "I", 2 -> "II", 10 -> "X"
        )
        println(romanNumeral(10))

        //Imprime todos los elementos de lo que reciba, separados por lo que reciba como parametro la función mkString
        def formatArgs(args: Array[String]) = args.mkString("\n")
        println(formatArgs(args))
        val res = formatArgs(Array("zero", "one", "two"))
        /*Forma de hacer test en Scala, si hay un error imprime en pantalla
             AssertionError
        */
        assert(res == "zero\none\ntwo")

    }
}