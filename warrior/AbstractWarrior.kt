package module11_Sravneniye.Homework.warrior

import module11_Sravneniye.Homework.isSuccessful
import module11_Sravneniye.Homework.weapon.AbstractWeapon

abstract class AbstractWarrior(
    private val maxHealth: Int,
    private val accuracy: Int,
    private var weapon: AbstractWeapon
): Warrior {
    var currentHealthLevel = maxHealth
    override val isKilled: Boolean
        get() {
            return currentHealthLevel == 0
        }
    override fun attack(enemy: Warrior): Int {
        var sumDamage = 0
        var currentDmg: Int
        if(!isKilled){
            if(weapon.isEmpty){
                weapon.recharge()
                return 0
            }else {
                val currentAmmo = weapon.getAmmo()
                if (isSuccessful(accuracy) && !isSuccessful(enemy.dodge)) {
                    if(weapon.type == SingleShot){
                        sumDamage = currentAmmo!!.currentDamage()
                    }else{
                        while (!weapon.isEmpty){
                            currentDmg = weapon.getAmmo()!!.currentDamage()
                            sumDamage += currentDmg
                        }
                    }

                    enemy.getDamaged(sumDamage)
                }
            }
        }
        return sumDamage
    }

    override fun getDamaged(damage: Int) {
        if(damage < currentHealthLevel) currentHealthLevel -= damage
        else currentHealthLevel = 0
    }
}