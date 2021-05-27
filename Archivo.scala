/* MAyo, 2021 Ummyers
* Imprime el tamaño de la línea y la linea del archivo
*/
import scala.io.Source

object Archivo{
    def main(args: Array[String]){
        if (args.length > 0){
            for(line <- Source.fromFile(args(0)).getLines())
                println(line.length + " " + line)
        }else{
            Console.err.println("No indicaste archivo alguno")
        }
    }
}