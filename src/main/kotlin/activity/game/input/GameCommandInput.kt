package activity.game.input

import activity.game.SourceCode


class GameCommandInput : SourceCode() {
    fun isCommand(input: String) {
        when (input) {
            GameCommand.REVIEWC.command -> {
                getSourceCode.forEach { codeln ->
                    println(codeln)
                }
            }


        }
    }
}