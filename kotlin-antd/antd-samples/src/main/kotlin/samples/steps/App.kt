package samples.steps

import react.*
import react.dom.*

class StepsApp : RComponent<RProps, RState>() {
    override fun RBuilder.render() {
        h2 { +"Steps" }
        div {
            simple()
            smallSize()
            icon()
            stepNext()
            vertical()
            verticalSmall()
            error()
            progressDot()
            customizedProgressDot()
            clickable()
        }
    }
}

fun RBuilder.stepsApp() = child(StepsApp::class) {}
