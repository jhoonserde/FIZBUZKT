package activity.menu.input

import activity.menu.input.command.ExecCommand

class Input() {

    private val readInput: String = readlnOrNull() ?: ""

    val tokenCommand = readInput.split(" ")

    var isRead: Boolean = true

}