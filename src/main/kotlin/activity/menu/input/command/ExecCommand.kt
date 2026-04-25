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

            MenuCommand.OPTIONS.command -> tui.selectedMenu(1)

            MenuCommand.HELP.command -> tui.selectedMenu(2)

            MenuCommand.EMPTY_INPUT.command -> tui.selectedMenu(0)

            MenuCommand.EXIT.command -> {
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