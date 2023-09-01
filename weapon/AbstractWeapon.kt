package module11_Sravneniye.Homework.weapon

import module11_Sravneniye.Homework.Stack

abstract class AbstractWeapon(
    private val maxAmount: Int,
    var type: FireType,
    var ammoStore: Stack<Ammo>
    ){

    var isEmpty = true
    abstract fun createAmmo(): Ammo

    fun recharge(){
        val store = Stack<Ammo>()
        for(i in 1..maxAmount)
            store.push(createAmmo())
        ammoStore = store
        isEmpty = false
    }

    fun getAmmo(): Ammo? {
        var ammo: Ammo? = ammoStore.pop()
        isEmpty = ammoStore.isEmpty()
        return ammo
    }
}