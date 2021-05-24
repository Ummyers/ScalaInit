object ST{
    def main (args: Array[String]){
        import scala.util.Random

        val x: Int = Random.nextInt(10)

        /* Se supone que debería funcionar con algo como:
        *   case <number> => "NameNumber"
        *   sin embargo, no funciona, arroja el compilador un warning de que falta 
        *   en la pagina de la siguiente URL
        *   https://docs.scala-lang.org/tour/pattern-matching.html#
        *   así lo indica pero  en esta otra pagina lo indica como se programa en este archivo
        *   https://docs.scala-lang.org/overviews/scala-book/match-expressions.html
        *   Posible problema de entendimiento. 19/Mayo/2021
        */
        x match {
        case 0 => println("zero")
        case 1 => println("one")
        case 2 => println("two")
        case _ => println("other")
        }

        //---------Alternativa------------
        println(x match {
            case 0 => "no hay mes zero"
            case 1 => "uno"
            case 2 => "dos"
            case _ => "Nothing"
        })

        /* Con lo siguiente si funciona    */
        def matchTest(x: Int): String = x match { //Devuele un String -.- 
            case 1 => "one"
            case 2 => "two"
            case _ => "otro que no fue ni dos ni uno"
        }
        matchTest(3)  // prints other
        matchTest(1)  // prints one
        
        println(matchTest(3))

    
    }
}