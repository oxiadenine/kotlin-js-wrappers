package samples.drawer

import react.RBuilder
import react.RComponent
import react.RProps
import react.State
import react.dom.h2
import styled.StyleSheet
import styled.css
import styled.styledDiv

object DrawerStyles : StyleSheet("drawer", isStatic = true) {
    val container by css {}
    val basicRight by css {}
    val multiLevelDrawer by css {}
    val placement by css {}
    val userProfile by css {}
}

class DrawerApp : RComponent<RProps, State>() {
    override fun RBuilder.render() {
        h2 { +"Drawer" }
        styledDiv {
            css { +DrawerStyles.container }
            basicRight()
            multiLevelDrawer()
            placement()
            userProfile()
        }
    }
}

fun RBuilder.drawerApp() = child(DrawerApp::class) {}
