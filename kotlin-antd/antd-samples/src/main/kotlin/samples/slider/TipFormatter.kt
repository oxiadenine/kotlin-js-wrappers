package samples.slider

import antd.slider.slider
import react.*
import react.dom.*
import styled.css
import styled.styledDiv

private fun formatter(value: Number): ReactElement {
    return buildElement { +"$value%" }
}

fun RBuilder.tipFormatter() {
    styledDiv {
        css { +SliderStyles.tipFormatter }
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
