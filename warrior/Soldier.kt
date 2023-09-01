package module11_Sravneniye.Homework.warrior

import module11_Sravneniye.Homework.warrior.AbstractWarrior
import module11_Sravneniye.Homework.weapon.AbstractWeapon
import module11_Sravneniye.Homework.weapon.Weapons

class Soldier(maxHealth: Int = 100, accuracy: Int = 50, weapon: AbstractWeapon = Weapons.createPistol()):
    AbstractWarrior(maxHealth, accuracy, weapon) {
    override val dodge = 30
}