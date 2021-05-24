/*Programa que maneja if como condicional, bucle while y listas en Scala*/

object Condition{
    def main(args: Array[String]){
        println("HELLO! " + args(0))

        var i = 0 //los datos de tipo var si cambian de valor
        
        //Imprime todos los argumentos
        while(i < args.length) {
            println(args(i))
            i+=1
        }
    
        //Imprime todos los argumentos pero con una función
        println("Se imprime con funcional")
        //Itera en todo el arreglo con nombre args
        args.foreach(arg => println(arg))

        println("En esta función no se infiere el tipo")
        args.foreach((arg: String) => println(arg))

        //Creando una lista 
        val onTwoThree = List(1,2,3)
        val four = List(4)
        //Contatenando listas
        val oneFour = onTwoThree ::: four
        println(oneFour)
        
        //Para concatenar un elemento con una lista se usa ::
        //siempre va primero el elemento
        val new2List = 0 :: oneFour
        println(new2List)

        //Lista Vacia
        val numbers = List() //or Nil
        println(numbers)

        //Si el primer elemento es cero entonces imprime
        if(new2List.head == 0){
            println("Condicional funcionando")
        }


    }
}