package module11_Sravneniye.Homework.warrior

import module11_Sravneniye.Homework.warrior.AbstractWarrior
import module11_Sravneniye.Homework.weapon.AbstractWeapon
import module11_Sravneniye.Homework.weapon.Weapons

class General(maxHealth: Int = 200, accuracy: Int = 90, weapon: AbstractWeapon = Weapons.createGrenade()):
    AbstractWarrior(maxHealth, accuracy, weapon) {
    override val dodge = 10
}