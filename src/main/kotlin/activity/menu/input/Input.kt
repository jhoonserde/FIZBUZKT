package activity.menu.input

import activity.menu.input.command.ExecCommand

class Input {

    private val readInput: String = readlnOrNull() ?: ""

    private val tokenCommand = readInput.split(" ")

    var isRead: Boolean = true

    fun readerInput() {
        do {
            print(">> ")
            val input = Input()
            input.readInput
            val execCommand = ExecCommand(
                tokenCommand = input.tokenCommand,
                inputObject = this
            )
            execCommand.executeCommand()
        } while (isRead)
    }
}