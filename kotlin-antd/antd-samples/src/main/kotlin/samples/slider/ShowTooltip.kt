package samples.slider

import antd.slider.slider
import kotlinx.html.id
import react.*
import react.dom.*

fun RBuilder.showTooltip() {
    div("slider-container") {
        attrs.id = "slider-show-tooltip"
        slider {
            attrs {
                defaultValue = 30
                tooltipVisible = true
            }
        }
    }
}
