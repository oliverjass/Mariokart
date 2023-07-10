import Classes.Charakter
import Classes.Fahrzeug
import Classes.Kart

val liste = listOf<String>("Oliver","Gordon","Mario")


var autos = mutableMapOf<String,Int>(
    "Auto" to (20..40).random(),
    "Auto2" to (20..40).random(),
    "Auto3" to (20..40).random(),
    "Auto4" to (20..40).random()

)

fun main(){
    liste.toMutableList()
    println("Wähle dir eine figur aus")
    var auswahl = readln().toInt()-1


    println("${liste[auswahl]}")


    println(autos)
    println(autos)
    println(autos)
    println(autos)

}