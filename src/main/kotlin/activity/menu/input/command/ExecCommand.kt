package activity.menu.input.command

import activity.ErrorMessage
import activity.menu.input.Input
import activity.menu.tui.TuiManager

class ExecCommand(
    val tokenCommand: List<String>,
    val inputObject: Input
) {

    val tui = TuiManager()

    fun executeCommand() {
        //check is input blank
        when (tokenCommand[0]) {

            MenuCommand.OPTIONS.nameMenu -> tui.selectedMenu(1)

            MenuCommand.HELP.nameMenu -> tui.selectedMenu(2)

            MenuCommand.EXIT.nameMenu -> {
                inputObject.isRead = false
                println ("Exit")
            }

            else -> {
                tui.selectedMenu(0)
                println(ErrorMessage(this).errorMessage())
            }
        }
    }
}