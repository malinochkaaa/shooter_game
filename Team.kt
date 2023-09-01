package module11_Sravneniye.Homework

import module11_Sravneniye.Homework.warrior.AbstractWarrior

class Team {
    val teamList = mutableListOf<AbstractWarrior>()
    init {
        for(i in 0..10){
            teamList.add(isInTeam())
        }
    }
    var isTeamAlive = true
}