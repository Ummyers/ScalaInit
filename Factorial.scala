object Factorial{
    def factorial(n:Int): Int = {
            if (n == 1) 1
            else factorial (n-1) * n    
    }

    def main(args: Array[String]){
        if (args.length > 0){
            val rango = args(0).toInt;

            println("El factorial de " + args(0) + " es " + factorial(rango))

        }else{
            Console.err.println("No indicaste el número por calcular el factorial")
        }

    }
}