object Suma{
    def sumaPrimeros(num: Int): Int ={
            if (num == 1){
                1
            }else{
                num + sumaPrimeros(num-1)
            }
        }

    def main(args: Array[String]){
        //Convierte el String a Integer
        val rango = args(0).toInt;
        val initFormula = System.nanoTime
        //Calcula la suma de los primeros "rango" numeros con la fórmula
        val sumaTotal = ((rango)*((rango)+1))/2
        val endFormula = System.nanoTime
        println("Fórmula tomo tiempo: " + (endFormula - initFormula))


        println("Fórmula@@ La suma de los primeros " + args(0) + " números naturales es: " + sumaTotal)

        //Suma de los primeros 50 números es igual a 1225
        val initTime = System.nanoTime
        println("Método@@ La suma de los primeros 50 números es: " + sumaPrimeros(rango))
        val endTime = System.nanoTime
        //System.nanoTime devuelve nanosegundos 
        println("Método tiempo: " + (endTime - initTime))

    }
}