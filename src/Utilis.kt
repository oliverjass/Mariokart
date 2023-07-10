// Zeit

fun loadingLine(){
    repeat(10){
        println("|")
        Thread.sleep(50)
    }
}


fun cr(): String{
    var cars = mutableListOf("ō͡≡o","-0-")
    return cars.random()
}






// Farbpalette
val RED = "\u001B[31m"
val GREEN = "\u001B[32m"
val YELLOW = "\u001B[93m"
val YELLOW2 = "\u001B[33m"
val BLUE = "\u001B[34m"
val PURPLE = "\u001B[35m"
val CYAN = "\u001B[36m"
val UNDERLINE = "\u001B[4m"
val RESET = "\u001B[0m"


// Items

val ITEMNAME = listOf(
    "Banane",
    "Drei Bananen",
    "Blitz",
    "Turbo Pilz",
    "Drei Turbo Pilze",
    "Bo-omb","Kugelwilli",
    "Roter Panzer",
    "Blauer Panzer",
    "Stern",
    "Feuer Blume",
    "Super Hupe")


// Icons
val BANANE ="🍌"
val BANANEDREI = "\uD83C\uDF4C\uD83C\uDF4C\uD83C\uDF4C"
val BLITZ ="${YELLOW}⚡${RESET}"
val TURBOPILZ = "\uD83C\uDF44"
val TURBOPILZDREI ="\uD83C\uDF44\uD83C\uDF44\uD83C\uDF44"
val GOLDTURBOPILZ ="\uD83C\uDFF5\uFE0F"
val BOMB = "💣"
val ITEMBOX = "\uD83C\uDF81"
val KUGELWILLI = "\uD83D\uDE80"
val REDPANZER = "\uD83D\uDD34"
val GREENPANZER = "\uD83D\uDFE2"
val BLUEPANZER = "\uD83D\uDD35"
val STERN = "⭐"
val FEUERBLUME = "\uD83C\uDF3B"
val SUPERHUPE = "\uD83D\uDD0A"


// SONST
val FLAGGE = "\uD83C\uDFC1"
val KRONE = "\uD83D\uDC51"


// Characters
val characters = listOf<String>(
    "Mario",
    "Luigi",
    "Bowser",
    "Princess Peach",
    "Princess Daisy",
    "Toad",
    "Wario",
    "Yoshi",
    "Ludwig",
    "Donkey Kong",
    "Link",
    "Rosalina")






val fahrzeuge = listOf("ō͡≡o","-0-")





val trackNames = listOf<String>(
    "Mario kart Stadium",
    "Water Park",
    "Sweet Sweet Canyon",
    "Thwomp Ruins",
    "Mario Circuit",
    "Toad Harbor",
    "Twisted Mansion",
    "Shy Guy Falls",
    "Cloud Top Cruise",
    "Bone-Dry Dunes",
    "Bowsers Castle",
    "Rainbow Road")

val cupNamen = listOf(
    "Mushroom Cup",
    "Flowers Cup",
    "Special Cup")


fun main(){

    var sonst = listOf("$FLAGGE","$KRONE")
    var items = listOf("$BANANE","$BANANEDREI","$BLITZ","$TURBOPILZ","$TURBOPILZDREI","$BOMB","$ITEMBOX","$GOLDTURBOPILZ","$KUGELWILLI","$REDPANZER","$GREENPANZER","$BLUEPANZER","$STERN","$FEUERBLUME","$SUPERHUPE")
    println(characters.random())
}