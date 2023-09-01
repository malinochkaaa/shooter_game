package module11_Sravneniye.Homework.weapon

import module11_Sravneniye.Homework.isChanceCritical

enum class Ammo (private val damage: Int, private val chance: Int, private val factor: Int){
    PISTOL(10, 7, 3),
    SHOTGUN(30, 9, 5),
    GRENADE(70, 15, 15),
    SNIPER_RIFLE(50, 11, 10);

    fun currentDamage(): Int{
        return if (chance.isChanceCritical()) damage * factor
        else damage
    }
}