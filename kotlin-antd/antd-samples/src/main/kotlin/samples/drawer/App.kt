package samples.drawer

import react.*
import react.dom.*
import styled.*

object DrawerStyles : StyleSheet("drawer", isStatic = true) {
    val container by css {}
    val basicRight by css {}
    val multiLevelDrawer by css {}
    val placement by css {}
    val userProfile by css {}
}

class DrawerApp : RComponent<RProps, RState>() {
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
