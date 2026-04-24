package activity

import activity.menu.input.command.ExecCommand

class ErrorMessage(val errorObject: Any) {

    fun errorMessage(): String {
        return when (errorObject) {

            is ExecCommand -> "Unknown command: ${errorObject.tokenCommand[0]}"

            else -> "Program is corrupt, you have reinstall this program"
        }

    }

}