package activity.menu.input

class Input {

    var stopReadInput = true

    fun readerInput() {
        do {
            print(">> ")
            val readerInput = MenuCommandInput(readln())
            readerInput.executeCommand(this)
        } while (stopReadInput)
    }
}