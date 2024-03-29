package samples.slider

import antd.slider.slider
import react.RBuilder
import react.dom.div
import styled.css
import styled.styledDiv

private fun handleChange(value: Array<Number>) {
    console.log("onChange: ", value)
}

private fun handleAfterChange(value: Array<Number>) {
    console.log("onAfterChange: ", value)
}

fun RBuilder.event() {
    styledDiv {
        css { +SliderStyles.event }
        div {
            slider {
                attrs {
                    defaultValue = 30
                    onChange = ::handleChange
                    onAfterChange = ::handleAfterChange
                }
            }
            slider {
                attrs {
                    range = true
                    step = 10
                    defaultValue = arrayOf(20, 50)
                    onChange = ::handleChange
                    onAfterChange = ::handleAfterChange
                }
            }
        }
    }
}
