package samples.menu

import react.*
import react.dom.*
import styled.*

object MenuStyles : StyleSheet("menu", isStatic = true) {
    val container by css {}
    val horizontal by css {}
    val inline by css {}
    val inlineCollapsed by css {}
    val siderCurrent by css {}
    val vertical by css {}
    val theme by css {}
    val switchMode by css {}
    val styleDebug by css {}
}

class MenuApp : RComponent<RProps, RState>() {
    override fun RBuilder.render() {
        h2 { +"Menu" }
        styledDiv {
            css { +MenuStyles.container }
            horizontal()
            inline()
            inlineCollapsed()
            siderCurrent()
            vertical()
            theme()
            switchMode()
            styleDebug()
        }
    }
}

fun RBuilder.menuApp() = child(MenuApp::class) {}
