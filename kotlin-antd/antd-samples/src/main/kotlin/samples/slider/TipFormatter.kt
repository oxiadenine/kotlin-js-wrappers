package samples.slider

import antd.slider.*
import react.*
import react.dom.*
import styled.*

private fun formatter(value: Number?): ReactElement {
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
