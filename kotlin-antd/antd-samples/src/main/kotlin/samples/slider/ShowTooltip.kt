package samples.slider

import antd.slider.*
import react.*
import styled.*

fun RBuilder.showTooltip() {
    styledDiv {
        css { +SliderStyles.showTooltip }
        slider {
            attrs {
                defaultValue = 30
                tooltipVisible = true
            }
        }
    }
}
