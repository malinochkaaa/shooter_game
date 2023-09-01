package module11_Sravneniye.Homework.weapon

sealed class FireType{
    data class BurstShot(val burstLength: Int): FireType(){}
    object SingleShot: FireType() {}
}
