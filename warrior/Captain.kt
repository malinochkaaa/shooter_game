package module11_Sravneniye.Homework.warrior

import module11_Sravneniye.Homework.warrior.AbstractWarrior
import module11_Sravneniye.Homework.weapon.AbstractWeapon
import module11_Sravneniye.Homework.weapon.Weapons

class Captain(maxHealth: Int = 150, accuracy: Int = 70, weapon: AbstractWeapon = Weapons.createShotgun()):
    AbstractWarrior(maxHealth, accuracy, weapon) {
    override val dodge = 20
}