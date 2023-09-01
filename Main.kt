package module11_Sravneniye.Homework

fun main(){
    val game = Battle()
    var currentState = game.gameState()

    while (currentState is BattleState.Progress){
        println(currentState.battleInfo)
        game.playGame()
        currentState = game.gameState()
    }

}