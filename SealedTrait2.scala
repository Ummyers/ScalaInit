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

        /* Con lo siguiente si funciona    */
        def matchTest(x: Int): String = x match { //Devuele un String -.- 
            case 1 => "one"
            case 2 => "two"
            case _ => "otro que no fue ni dos ni uno"
        }
        matchTest(3)  // prints other
        matchTest(1)  // prints one
        
        println(matchTest(3))

        /*Otro ejemplo*/
        def showNotification(notification: Notification): String = {
            notification match {
                case Email(sender, title, _) =>
                s"You got an email from $sender with title: $title"
                case SMS(number, message) =>
                s"You got an SMS from $number! Message: $message"
                case VoiceRecording(name, link) =>
                s"You received a Voice Recording from $name! Click the link to hear it: $link"
             }
        }
        val someSms = SMS("12345", "Are you there?")
        val someVoiceRecording = VoiceRecording("Tom", "voicerecording.org/id/123")

        println(showNotification(someSms))  // prints You got an SMS from 12345! Message: Are you there?

        println(showNotification(someVoiceRecording))  // prints You received a Voice Recording from Tom! Click the link to hear it: voicerecording.org/id/123


    }
}