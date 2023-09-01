package module11_Sravneniye.Homework

import kotlin.math.min

class Battle {
    private var team1 = Team()
    private var team2 = Team()
    var endGame: Boolean = false

    fun gameState(): BattleState{
         return when {
            team1.isTeamAlive && team2.isTeamAlive -> {
                endGame = false
                BattleState.Progress("Состояние здоровья команды 1: ${teamState(team1).first} \n" +
                        "Количество выживших в команде 1: ${teamState(team1).second} \n" +
                        "Состояние здоровья команды 2: ${teamState(team2).first} \n" +
                        "Количество выживших в команде 2: ${teamState(team2).second}")
            }
            team1.isTeamAlive && !team2.isTeamAlive -> {
                endGame = true
                BattleState.FirstWins
            }
            !team1.isTeamAlive && team2.isTeamAlive -> {
                endGame = true
                BattleState.SecondWins
            }
            else -> {
                endGame = true
                BattleState.Draw
            }
        }
    }
    fun playGame(){
        team1.teamList.shuffle()
        team2.teamList.shuffle()
        for (i in 0 until min(team1.teamList.size, team2.teamList.size)){
            team1.teamList[i].attack(team2.teamList[i])
            team2.teamList[i].attack(team1.teamList[i])
        }
    }

    private fun teamState(team: Team): Pair<Int, Int>{
        var healthSum = 0
        var teamCount = 0
        team.isTeamAlive = false
        for (i in 0 until team.teamList.size){
            if(!team.teamList[i].isKilled){
                team.isTeamAlive = true
                teamCount++
            }
            healthSum += team.teamList[i].currentHealthLevel
        }
        return Pair(healthSum, teamCount)
    }
}