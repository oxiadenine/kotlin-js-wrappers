package samples.icon

import react.*
import react.dom.*

class IconApp : RComponent<RProps, RState>() {
    override fun RBuilder.render() {
        h2 { +"Icon" }
        div {
            basic()
            custom()
            twoTone()
            iconfont()
            oldIcons()
        }
    }
}

fun RBuilder.iconApp() = child(IconApp::class) {}
