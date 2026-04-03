package activity.menu.input

import activity.ErrorMessage
import activity.game.codeEditor
import activity.menu.helpTitle
import activity.menu.optionsTitle

class MenuCommandInput(val input: String) {
    var isError: Boolean = false
    fun executeCommand() {
        //check is input blank
        when (input) {
            MenuCommand.START.nameMenu -> codeEditor()
            MenuCommand.OPTIONS.nameMenu -> optionsTitle()
            MenuCommand.HELP.nameMenu -> helpTitle()
            MenuCommand.EXIT.nameMenu -> println("Exit the game")
            else -> {
                if (input.isNotBlank()) println(
                    ErrorMessage(this).errorMessage()
                )
                isError = true
            }
        }
    }
}