package samples.tabs

import react.*
import react.dom.*

class TabsApp : RComponent<RProps, RState>() {
    override fun RBuilder.render() {
        h2 { +"Tabs" }
        div {
            basic()
            disabled()
            icon()
            slide()
            extra()
            size()
            position()
            card()
            editableCard()
            cardTop()
            customAddTrigger()
            nest()
        }
    }
}

fun RBuilder.tabsApp() = child(TabsApp::class) {}
