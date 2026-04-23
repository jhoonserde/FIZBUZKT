import activity.menu.input.Input
import activity.menu.tui.TuiManager

fun main() {

    val tuiManager = TuiManager()

    val input = Input()

    tuiManager.selectedMenu(0)

    input.readerInput()
}
