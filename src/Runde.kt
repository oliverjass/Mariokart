fun countDown(){
    countdown(3)
    Thread.sleep(1000)
    println("                   |$YELLOW            ####     ####     ##    $RESET  |\n" +
            "                   |$YELLOW           ##  ##   ##  ##    ##    $RESET  |\n" +
            "                   |$YELLOW           ##       ##  ##    ##    $RESET  |\n" +
            "                   |$YELLOW           ## ###   ##  ##    ##    $RESET  |\n" +
            "                   |$YELLOW           ##  ##   ##  ##          $RESET  |\n" +
            "                   |$YELLOW           ##  ##   ##  ##          $RESET  |\n" +
            "                   |$YELLOW            ####     ####     ##    $RESET  |")
    Thread.sleep(200)
}

fun finish(){
    println()
    println("$YELLOW                                                               \n" +
            " ######   ######   ##  ##   ######    ####    ##  ##     ##    \n" +
            " ##         ##     ### ##     ##     ##       ##  ##     ##    \n" +
            " #####      ##     ######     ##      ####    ######     ##    \n" +
            " ##         ##     ######     ##         ##   ##  ##     ##    \n" +
            " ##         ##     ## ###     ##         ##   ##  ##           \n" +
            " ##       ######   ##  ##   ######    ####    ##  ##     ## $RESET")
}


// TODO Das muss ich kontrollieren von Batch 8 kopiert
fun countdown(seconds: Int) {
    for (i in seconds downTo 0) {
        if (i == 9)
            print("\b")

        print("\b$i")

        if (i != 0)
            Thread.sleep(1000)
        else
            println()
    }
}

fun main(){
    countDown()
    finish()
}