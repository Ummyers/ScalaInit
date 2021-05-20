/* Para entender el uso de SealedTrait */
object SealedTrait{
    def main(args: Array[String]) {
        println("Hello")

        val subscHBOGOT = Subscribirse(Canal("HBO - Game of Thrones"))

        println(subscHBOGOT)

    }//End Main

    /*Se crea un Accion que extiende Sub, DesSub y mensaje*/
    sealed trait Accion
    case class Subscribirse(canal: Canal) extends Accion
    case class DesSubcribirse(canal: Canal) extends Accion
    case class Mensaje(canal: Canal, mensaje: String) extends Accion
    /*Un dato tipo Canal*/
    case class Canal(name: String)


}