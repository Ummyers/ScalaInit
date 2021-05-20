object Demo {
   def main(args: Array[String]) {

       val rectangulo = Rectangle(10,1)
       println(rectangulo.area)
       val areaCirculo = Circulo(1)
       println(areaCirculo.area)

        /*Para crear un case class con los valores de otro case class*/
        val newRectangle = rectangulo.copy(width = rectangulo.width * 2)
        println(newRectangle)
   }

    /*Los case class definen tipos de datos inmutables*/

    /*Los case class no se modifican, son inmutables*/
    case class Rectangle(width: Int, height: Int){
        val area = width * height
    }

    /* Es decir, algo como:
    *  val rectangle = Rectangle(10,1)
    *  rectangle.area = rectangle.area * 2
    *  Será un error en compilación
    */

    case class Circulo(radio:Int){
        val area = 3.1416 * radio * radio 
    }
}