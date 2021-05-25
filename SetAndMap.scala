object Set{
    def main(arg: Array[String]){
        var ejercitoDumbledore = Set("Hermione", "Harry")
        ejercitoDumbledore += "Ron" //Se agrega Ron al conjunto ejercitoDumbledore
        println(ejercitoDumbledore.contains("Luna"))
        ejercitoDumbledore += "Luna"
        println(ejercitoDumbledore.contains("Luna"))
        

        
    }
}