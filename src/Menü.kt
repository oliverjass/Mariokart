import Classes.*

fun startGame(){
    println(" ████     ████     ██████    █████████    ████    ███████    ███    ███     ██████    █████████  ████████████\n" +
            " █████████████    ███  ███   ███    ████  ████  ███     ███  ███   ██      ███  ███   ███    ████    ████    \n"  +
            " ███  ███  ███   ████  ████  ████████     ████  ███     ███  ████████     ████  ████  ████████       ████    \n" +
            "████  ███  ████  ███    ███  ███    ███   ████    ███████    ███    ███   ███    ███  ███    ███     ████    \n")

    println("${CYAN} " +
            "            ::::::::    :::   :::       ::::    :::   :::::::::::           :::        :::    ::: \n" +
            "           :+:    :+:   :+:   :+:       :+:+:   :+:       :+:             :+: :+:      :+:    :+:  \n" +
            "          +:+           +:+ +:+        :+:+:+  +:+       +:+            +:+   +:+      +:+  +:+    \n" +
            "         +#++:++#++     +#++:         +#+ +:+ +#+       +#+           +#++:++#++:      +#++:+      \n" +
            "               +#+      +#+          +#+  +#+#+#       +#+           +#+     +#+     +#+  +#+      \n" +
            "       #+#    #+#      #+#          #+#   #+#+#       #+#           #+#     #+#    #+#    #+#      \n" +
            "       ########       ###          ###    ####       ###           ###     ###    ###    ###       ${RESET}\n")
    println()
    println("                                           [PRESS ENTER]                                                          ")
    readln()
    mainMenue()
}

fun mainMenue(){
    loadingLine()
    println("----------------- Hauptmenü -----------------")
    println()
    println("  [1]  Schnelles Rennen                      ")
    println("  [2]  Grand Prix                            ")
    println("  [3]  VS Rennen                             ")
    println("  [4]  Spiel beenden                         ")
    println()
    println("----------------- Hauptmenü -----------------")
    var eingabe = readln().toInt()
        when(eingabe) {
            1 -> ccMenue()
            2 -> ccMenue()
            3 -> ccMenue()
            4 -> println("Spiel wird beendet")
            else -> {
                try {
                    (eingabe >= 5)
                    println("   ${RED}FEHLER: Nummer überschritten! versuch es nochmal${RESET}")
                    mainMenue()
                } catch (e:Exception) {
                    eingabe.toString()
                    println("${RED}FEHLER: Du musst eine Nummer eingeben!${RESET}")
                    mainMenue()
                }
            }
        }
}






fun ccMenue(){
    loadingLine()
    println("---------------- Speed menü --------------")
    println()
    println("  [1]   50 cc                             ")
    println("  [2]  100 cc                             ")
    println("  [3]  150 cc                             ")
    println("  [4]  200 cc                             ")
    println()
    println("---------------- [5] [zurück] ------------")

    var eingabe = readln().toInt()
    try {
        when {
        eingabe == 1 -> {
            "50cc"
            characterMenue()
        }
        eingabe == 2 -> {
            "100cc"
            characterMenue()
        }
        eingabe == 3 -> {
            "150cc"
            characterMenue()
        }
        eingabe == 4 -> {
            "200cc"
            characterMenue()
        }
        eingabe == 0 ->{
            "zurück"
            mainMenue()
        }
        eingabe >= 5 -> {
            println("   ${RED}FEHLER: Nummer überschritten! versuch es nochmal${RESET}")
            ccMenue()
        }
    }
    } catch (e:Exception){
        println("${RED}Sie müssen eine zahl eingeben${RESET}")
        ccMenue()
    }

}

fun characterMenue() {
    loadingLine()
    println("[--------Characters-------------------------------------]")
    println()
/*    for (character in selectCharacter.indices) {
        println("${character + 1}. ${selectCharacter[character]}")
    }*/

    println("""
             [1]    Mario                 [7]    Wario                      
             [2]    Luigi                 [8]    Yoshi                      
             [3]    Bowser                [9]    Ludwig                     
             [4]    Prinzessin Peach     [10]    Donkey Kong                
             [5]    Prinzessin Daisy     [11]    Link                      
             [6]    Toad                 [12]    Rosalina                    
    """.trimIndent())
    println()
    println()
    println(" Wählen Sie ihr Charakter aus: 1-${characters.size}                     ")
    println()
    println("   [13]   [zurück]                                        ")
    println("   [14]   [abbrechen]                                     ")
    println("[-------------------------------------------------------]")
    var auswahlCharakter = characters.toMutableList()
    val eingabe = readln().toInt()
    var inputCharacter = eingabe
            when {
                inputCharacter == 1 -> {
                    println("Character: ${auswahlCharakter.get(0)}")
                    crMenue()
                }
                inputCharacter == 2 -> {
                    println("Character: ${auswahlCharakter.get(1)}")
                    crMenue()
                }
                inputCharacter == 3 -> {
                    println("Character: ${auswahlCharakter.get(2)}")
                    crMenue()
                }
                inputCharacter == 4 -> {
                    println("Character: ${auswahlCharakter.get(3)}")
                    crMenue()
                }
                inputCharacter == 5 -> {
                    println("Character: ${auswahlCharakter.get(4)}")
                    crMenue()
                }
                inputCharacter == 6 -> {
                    println("Character: ${auswahlCharakter.get(5)}")
                    crMenue()
                }
                inputCharacter == 7 -> {
                    println("Character: ${auswahlCharakter.get(6)}")
                    crMenue()
                }
                inputCharacter == 8 -> {
                    println("Character: ${auswahlCharakter.get(7)}")
                    crMenue()
                }
                inputCharacter == 9 -> {
                    println("Character: ${auswahlCharakter.get(8)}")
                    crMenue()
                }
                inputCharacter == 10 -> {
                    println("Character: ${auswahlCharakter.get(9)}")
                    crMenue()
                }
                inputCharacter == 11 -> {
                    println("Character: ${auswahlCharakter.get(10)}")
                    crMenue()
                }
                inputCharacter == 12 -> {
                    println("Character: ${auswahlCharakter.get(11)}")
                    crMenue()
                }
                inputCharacter == 13 -> {
                    println("Character: ${auswahlCharakter.get(12)}")
                    crMenue()
                }
                inputCharacter == 14 -> {
                    ccMenue()
                }
                inputCharacter == 15 -> {
                    mainMenue()
                }
                (inputCharacter >= 15) || (inputCharacter.toString() == "")  -> {
                    println("   ${RED}FEHLER: Nummer überschritten! versuch es nochmal${RESET}")
                    characterMenue()
                }
            }
    }


fun crMenue(){
    loadingLine()
    println("[-------- Cars -----------------------------------------]")
    println()
    println("""
               [1]  ō͡≡o                [2]  -0-            
               Kart                    Bike           
    """.trimIndent())
    println()
    println(" Suchen sie einen Fahrzeug aus: 1-${fahrzeuge.size}                         ")
    println()
    println("  [0]   [zurück]                                         ")
    println("  [3]   [abbrechen]                                      ")
    println("[-------------------------------------------------------]")
    var selectCr = fahrzeuge.toMutableList()
    val selectedCrIndex = readln().toInt()
    var inputCr = selectedCrIndex
    try {
        when {
            inputCr == 1 -> {
                println("Fahrzeug: ${selectCr.get(0)}")
                "Kart"
                trackMenue()
            }
            inputCr == 2 -> {
                println("Fahrzeug: ${selectCr.get(1)}")
                "bike"
                trackMenue()
            }
            inputCr == 0 ->{
                "zurück"
                characterMenue()
            }
            inputCr == 3 ->{
                mainMenue()
            }
            inputCr >= 4 -> {
                println("   ${RED}FEHLER: Nummer überschritten! versuch es nochmal${RESET}")
                crMenue()
            }
        }
    } catch (e:Exception){
        println("${BLUE}Sie müssen eine zahl eingeben${RESET}")
        crMenue()
    }

}

fun trackMenue(){
    loadingLine()
    println("[--------Rennstrecke------------------------------------------------------------]")
    println("""
     Suchen sie eine Rennstrecke aus: 1-${trackNames.size}
    
     Mushroom Cup ${TURBOPILZ}             Flowers Cup ${FEUERBLUME}            Special Cup ${KRONE}           
      [1]  Mariokart Stadium    [5]  Mario Circuit      [9]  Cloud Top Cruise                       
      [2]  Water Park           [6]  Toad Harbor       [10]  Bone Dry Dunes                  
      [3]  Sweet Sweet Canyon   [7]  Twisted Mansion   [11]  Bowsers Castle        
      [4]  Twomp Ruins          [8]  Shy Guy Falls     [12]  Rainbow Road
      
                                  
    """)
    println("  [0]   [zurück]                                                                 ")
    println("  [13]  [abbrechen]                                                              ")
    println("[-------------------------------------------------------------------------------]")


    var selectTrack = trackNames.toMutableList()
    var inputTrack = readln().toInt()
    try {
           when {
                inputTrack == 1 -> {
                    println("Karte: ${selectTrack.get(0)}")
                    viewBox()
                    marioKartStadium()
                }
                inputTrack == 2 -> {
                    println("Karte: ${selectTrack.get(1)}")
                    viewBox()
                    waterPark()
                }
                inputTrack == 3 -> {
                    println("Karte: ${selectTrack.get(2)}")
                    viewBox()
                    sweetSweetCanyon()
                }
                inputTrack == 4 -> {
                    println("Karte: ${selectTrack.get(3)}")
                    viewBox()
                    twompRuins()
                }
                inputTrack == 5 -> {
                    println("Karte: ${selectTrack.get(4)}")
                    viewBox()
                    marioCircuit()
                }
                inputTrack == 6 -> {
                    println("Karte: ${selectTrack.get(5)}")
                    viewBox()
                    toadHarbor()
                }
                inputTrack == 7 -> {
                    println("Karte: ${selectTrack.get(6)}")
                    viewBox()
                    twistedMansion()
                }
                inputTrack == 8 -> {
                    println("Karte: ${selectTrack.get(7)}")
                    viewBox()
                    shyGuyFalls()
                }
                inputTrack == 9 -> {
                    println("Karte: ${selectTrack.get(8)}")
                    viewBox()
                    cloudTopCruise()
                }
                inputTrack == 10 -> {
                    println("Karte: ${selectTrack.get(9)}")
                    viewBox()
                    boneDryDunes()

                }
                inputTrack == 11 -> {
                    println("Karte: ${selectTrack.get(10)}")
                    viewBox()
                    bowsersCastle()
                }
                inputTrack == 12 -> {
                    println("Karte: ${selectTrack.get(11)}")
                    viewBox()
                    rainbowRoad()

                }
               inputTrack == 13 -> {
                   println("Character: ${selectTrack.get(12)}")
                   viewBox()
                   rainbowRoad()
               }
                inputTrack == 0 -> {
                    crMenue()
                }
                inputTrack == 13-> {
                    mainMenue()
                }
               inputTrack == 14 -> {
                   mushRoomCupRace()
               }
                (inputTrack >= 15) || (inputTrack.toString() == "")  -> {
                    println("   ${RED}FEHLER: Nummer überschritten! versuch es nochmal${RESET}")
                    trackMenue()
                }
            }
    } catch (e:Exception){
        println("${RED}Sie müssen eine zahl eingeben${RESET}")
        trackMenue()
    }





}

/*fun createInfoBox(charakter : Charakter, fahrzeug : Fahrzeug, track : Track, selectedNameIndex : Int, selectedCrIndex : Int, inputTrack : Int ): String {
    val selectedName = charakter.names[selectedNameIndex]
    val selectedCr = fahrzeug.names[selectedCrIndex]
    var selectedTrack = track.names[inputTrack]
    val infoBox = """
                |--------------------------
                | Character: $selectedName
                | Fahrzeug: $selectedCr
                | Level: $selectedTrack
                |--------------------------
    """.trimMargin()

    return infoBox
}*/




fun createInfoBox(charakter: Charakter, fahrzeug: Fahrzeug, track: Track): String {
    val selectedName = charakter.names.random()
    val selectedCr = fahrzeug.name.random()
    var selectedTrack = track.names.random()
    val infoBox = """
                |--------------------------
                | Character: ${selectedName}
                | Fahrzeug: $selectedCr
                | Level: ${selectedTrack}
                |--------------------------
    """.trimMargin()

    return infoBox
}

fun viewBox(){
    var namesList = characters
    var carList = fahrzeuge
    var trackList = trackNames
    val selectedCharakter = Charakter(namesList)
    val selectedFahrzeug = Fahrzeug(carList)
    val selectedTrack = Track(trackList)

    val infoBox = createInfoBox(selectedCharakter,selectedFahrzeug,selectedTrack)
    println(infoBox)



    println("Möchten sie das rennen starten? (j/n)")
    val auswahl = readln()

    if (auswahl?.toLowerCase() == "j"){
        println("Rennen starten")
    } else {
        trackMenue()
    }

}

fun nextTrack() {
    println("Möchten Sie weiterspielen?")
    println("   [1] -  Weiterspielen")
    println("   [2] -  Rennstrecke auswählen")
    println("   [3] -  zum Hauptmenü")
    var answerTrack = readln().toInt()

    if (answerTrack == 1) {
        "weiterspielen"
    } else if (answerTrack == 2) {
        trackMenue()
    } else if (answerTrack == 3) {
        mainMenue()
    } else {
        println("Fehler")
        nextTrack()
    }
}


