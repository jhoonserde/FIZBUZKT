import activity.menu.input.Input
import activity.menu.tui.TuiManager

fun main() {

    val tuiManager = TuiManager()

    tuiManager.selectedMenu(0)

    val input = Input()

    input.readerInput()
}