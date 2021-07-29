package samples.slider

import antd.slider.slider
import react.RBuilder
import styled.css
import styled.styledDiv

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
