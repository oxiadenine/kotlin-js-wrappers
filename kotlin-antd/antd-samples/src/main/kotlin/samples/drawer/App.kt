package samples.drawer

import react.*
import react.dom.*

class DrawerApp : RComponent<RProps, RState>() {
    override fun RBuilder.render() {
        h2 { +"Drawer" }
        div {
            basicRight()
            multiLevelDrawer()
            placement()
            userProfile()
        }
    }
}

fun RBuilder.drawerApp() = child(DrawerApp::class) {}
