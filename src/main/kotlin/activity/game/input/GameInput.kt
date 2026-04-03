package activity.game.input

import activity.game.SourceCode

fun insertCode(

) {
    val sourceCode = SourceCode()
    val gameCommandInput = GameCommandInput()
    while (/*sourceCode.getSourceCode.last() != "/endr"*/ true) {
        sourceCode.setSourceCode(readln())
        gameCommandInput.isCommand(

        )
    }
}