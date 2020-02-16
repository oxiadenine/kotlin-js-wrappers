package samples.slider

import antd.slider.slider
import kotlinx.html.id
import react.*
import react.dom.*

private fun formatter(value: Number): ReactElement {
    return buildElement { +"$value%" }!!
}

fun RBuilder.tipFormatter() {
    div("slider-container") {
        attrs.id = "slider-tip-formatter"
        div {
            slider {
                attrs.tipFormatter = ::formatter
            }
            slider {
                attrs.tipFormatter = null
            }
        }
    }
}
