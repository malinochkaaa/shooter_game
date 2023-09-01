package module11_Sravneniye.Homework

sealed class BattleState{
    class Progress(val battleInfo: String): BattleState()
    object FirstWins : BattleState()
    object SecondWins : BattleState()
    object Draw : BattleState()
}
