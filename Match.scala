import scala.util.Random

object matchIn{
    def main(args: Array[String]){

        def matchTest(x: Int): String = x match {
            case 1 => "one"
            case 2 => "two"
            case _ => "other"
        }
        matchTest(3)  // prints other
        matchTest(1)  // prints one
        
        println(matchTest(3))
    }
}