import activity.menu.input.Input
import activity.menu.input.command.ExecCommand
import activity.menu.tui.TuiManager

fun main() {

    val tuiManager = TuiManager()

    tuiManager.selectedMenu(0)

    do {
        print(">> ")
        val input = Input()
        val execCommand = ExecCommand(
            tokenCommand = input.tokenCommand,
            inputObject = input
        )
        execCommand.executeCommand()
    } while (input.isRead)
}