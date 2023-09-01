package module11_Sravneniye.Homework

import module11_Sravneniye.Homework.warrior.AbstractWarrior
import module11_Sravneniye.Homework.warrior.Captain
import module11_Sravneniye.Homework.warrior.General
import module11_Sravneniye.Homework.warrior.Soldier
import kotlin.random.Random

fun Int.isChanceCritical(): Boolean{
    return this >= Random.nextInt(1,100)
}

fun isSuccessful(chance: Int): Boolean{
    return chance >= Random.nextInt(1,100)
}

fun isInTeam(): AbstractWarrior {
    return when(Random.nextInt(1,100)){
        in 1..10 -> General()
        in 11..40 -> Captain()
        else -> Soldier()
    }
}

