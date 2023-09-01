package module11_Sravneniye.Homework.weapon

import module11_Sravneniye.Homework.BurstShot
import module11_Sravneniye.Homework.SingleShot
import module11_Sravneniye.Homework.Stack

object Weapons{
    val pistol: AbstractWeapon = createPistol()
    val shotgun: AbstractWeapon = createShotgun()
    val grenade: AbstractWeapon = createGrenade()
    val sniperRifle: AbstractWeapon = createSniperRifle()

    fun createPistol(): AbstractWeapon {
        return object : AbstractWeapon(10, SingleShot, Stack<Ammo>()) {
            override fun createAmmo(): Ammo {
                return Ammo.PISTOL
            }
        }
    }
    fun createShotgun(): AbstractWeapon {
        return object : AbstractWeapon(8, BurstShot(3), Stack<Ammo>()){
            override fun createAmmo(): Ammo {
                return Ammo.SHOTGUN
            }
        }
    }
    fun createGrenade(): AbstractWeapon {
        return object : AbstractWeapon(1, SingleShot, Stack<Ammo>()){
            override fun createAmmo(): Ammo {
                return Ammo.GRENADE
            }
        }
    }
    private fun createSniperRifle(): AbstractWeapon {
        return object : AbstractWeapon(10, SingleShot, Stack<Ammo>()){
            override fun createAmmo(): Ammo {
                return Ammo.SNIPER_RIFLE
            }
        }
    }
}