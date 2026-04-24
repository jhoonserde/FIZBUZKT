package activity.menu.tui

import activity.menu.graphics.mathEwwAscii
import activity.menu.graphics.menuTitle
import activity.menu.graphics.titleHelpMenu
import activity.menu.graphics.titleOptions

class TuiManager {

    init {

        clearScreen()

        println(mathEwwAscii)
    }

    fun selectedMenu(idMenu: Int) {
        when (idMenu) {
            0 -> println(menuTitle)
            1 -> println(titleOptions)
            2 -> println(titleHelpMenu)
        }
    }

    fun clearScreen() {

        print("\u001b[H\u001b[2J")

        System.out.flush()
    }

}