package samples.tooltip

import react.*
import react.dom.*

class TooltipApp : RComponent<RProps, RState>() {
    override fun RBuilder.render() {
        h2 { +"Tooltip" }
        div {
            basic()
            arrowPointAtCenter()
            placement()
            autoAdjustOverflow()
        }
    }
}

fun RBuilder.tooltipApp() = child(TooltipApp::class) {}
