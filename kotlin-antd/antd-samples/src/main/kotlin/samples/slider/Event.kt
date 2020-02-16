package samples.slider

import antd.slider.SliderValue
import antd.slider.slider
import kotlinx.html.id
import react.*
import react.dom.*

private fun handleChange(value: SliderValue) {
    console.log("onChange: ", value)
}

private fun handleAfterChange(value: SliderValue) {
    console.log("onAfterChange: ", value)
}

fun RBuilder.event() {
    div("slider-container") {
        attrs.id = "slider-event"
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
