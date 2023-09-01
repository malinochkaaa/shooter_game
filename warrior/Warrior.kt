package module11_Sravneniye.Homework.warrior

interface Warrior {
    val isKilled: Boolean
    val dodge: Int
    fun attack(warrior: Warrior): Int
    fun getDamaged(damage: Int)
}