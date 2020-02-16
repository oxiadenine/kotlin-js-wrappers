package samples.spin

import react.*
import react.dom.*

class SpinApp : RComponent<RProps, RState>() {
    override fun RBuilder.render() {
        h2 { +"Spin" }
        div {
            basic()
            inside()
            tip()
            customIndicator()
            size()
            nested()
            delayAndDebounce()
        }
    }
}

fun RBuilder.spinApp() = child(SpinApp::class) {}
