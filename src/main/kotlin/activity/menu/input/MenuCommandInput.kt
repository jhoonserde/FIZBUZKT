package activity.menu.input

import activity.ErrorMessage
import activity.menu.tui.TuiManager

class MenuCommandInput(val inputCommand: String) : TuiManager() {

    val tui = TuiManager()

    fun executeCommand(input: Input) {
        //check is input blank
        when (inputCommand) {

            MenuCommand.OPTIONS.nameMenu -> tui.selectedMenu(1)

            MenuCommand.HELP.nameMenu -> tui.selectedMenu(2)

            MenuCommand.EXIT.nameMenu -> {
                input.stopReadInput = false
                println ("Exit")
            }

            else -> {
                tui.selectedMenu(0)
                println(ErrorMessage(this).errorMessage())
            }
        }
    }
}