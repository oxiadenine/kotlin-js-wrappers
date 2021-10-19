package samples.menu

import react.RBuilder
import react.RComponent
import react.Props
import react.State
import react.dom.h2
import styled.StyleSheet
import styled.css
import styled.styledDiv

object MenuStyles : StyleSheet("menu", isStatic = true) {
    val container by css {}
    val horizontal by css {}
    val inline by css {}
    val inlineCollapsed by css {}
    val siderCurrent by css {}
    val vertical by css {}
    val theme by css {}
    val switchMode by css {}
}

class MenuApp : RComponent<Props, State>() {
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
        }
    }
}

fun RBuilder.menuApp() = child(MenuApp::class) {}
