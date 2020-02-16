package samples.popconfirm

import react.*
import react.dom.*

class PopconfirmApp : RComponent<RProps, RState>() {
    override fun RBuilder.render() {
        h2 { +"Popconfirm" }
        div {
            basic()
            placement()
            icon()
            locale()
            dynamicTrigger()
        }
    }
}

fun RBuilder.popconfirmApp() = child(PopconfirmApp::class) {}
