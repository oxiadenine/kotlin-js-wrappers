package samples.alert

import react.*
import react.dom.*

class AlertApp : RComponent<RProps, RState>() {
    override fun RBuilder.render() {
        h2 { +"Alert" }
        div {
            basic()
            closable()
            icon()
            banner()
            style()
            description()
            closeText()
            smoothClosed()
            customIcon()
        }
    }
}

fun RBuilder.alertApp() = child(AlertApp::class) {}
