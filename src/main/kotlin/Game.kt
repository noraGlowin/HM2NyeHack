fun main() {

    val name = "NORA"
    var healthPoints = 0
    val isBlessed = true
    val isImmortal = false
    val formula =  (Math.pow(Math.random(), (110 - healthPoints) / 100.0) * 20 ).toInt()

    val auraVisible = isBlessed && healthPoints > 50 || isImmortal
    val auraColor = if (auraVisible) "GREEN" else "NONE"

    val karma = when (formula) {
        in 0..5 -> "red"
        in 6..10 -> "orange"
        in 11..15 -> "purple"
        in 16..20 -> "green"
        else -> "player's health entered incorrectly"
    }

    val healthStatus = when (healthPoints) {
        100 -> "is in excellent condition!"
        in 90..99 -> "has a few scratches!"
        in 75..89 -> if (isBlessed) {"has some minor wounds but is healing quite quickly!"}
        else {"has some minor wounds!"}
        in 15..74 -> "looks pretty hurt!"
        else -> "is in awful condition!"
    }

    val A = "(Aura: $auraColor)"
    val B = "(Blessed: ${if (isBlessed) "Yes" else "No"})"
    val HS = "$name $healthStatus"
    val K = "(formula = $formula  So,Karma: $karma)"
    val HP = "(Health: $healthPoints)"


    val statusFormatString = "$HP $A $B $K -> $HS"
    println(statusFormatString)

}