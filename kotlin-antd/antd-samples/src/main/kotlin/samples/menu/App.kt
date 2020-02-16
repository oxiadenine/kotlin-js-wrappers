package samples.menu

import react.*
import react.dom.*

class MenuApp : RComponent<RProps, RState>() {
    override fun RBuilder.render() {
        h2 { +"Menu" }
        div {
            horizontal()
            inline()
            inlineCollapsed()
            siderCurrent()
            vertical()
            theme()
            switchMode()
        }
    }
}

fun RBuilder.menuApp() = child(MenuApp::class) {}
