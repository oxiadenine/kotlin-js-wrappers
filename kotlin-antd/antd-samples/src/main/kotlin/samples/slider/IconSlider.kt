package samples.slider

import antd.icon.*
import antd.slider.*
import kotlinext.js.*
import kotlinx.html.*
import react.*
import react.dom.*
import styled.*

interface IconSliderDemoProps : RProps {
    var min: Number
    var max: Number
}

interface IconSliderDemoState : RState {
    var value: Number
}

class IconSliderDemo : RComponent<IconSliderDemoProps, IconSliderDemoState>() {
    private val handleChange: (Number) -> Unit = {
        setState {
            value = it
        }
    }

    override fun IconSliderDemoState.init() {
        value = 0
    }

    override fun RBuilder.render() {
        val sliderMin = props.min.toInt()
        val sliderMax = props.max.toInt()

        val sliderMid = ((sliderMax - sliderMin) / 2)

        val sliderValue = state.value.toInt()

        val preColor = if (sliderValue >= sliderMid) "" else "rgba(0, 0, 0, .45)"
        val nextColor = if (sliderValue >= sliderMid) "rgba(0, 0, 0, .45)" else ""

        div("icon-wrapper") {
            frownOutlined {
                attrs.style = js { color = nextColor }
            }
            slider {
                attrs {
                    min = sliderMin
                    max = sliderMax
                    onChange = handleChange
                    value = sliderValue
                }
            }
            smileOutlined {
                attrs.style = js { color = preColor }
            }
        }
    }
}

fun RBuilder.iconSliderDemo(handler: RHandler<IconSliderDemoProps>) = child(IconSliderDemo::class, handler)

fun RBuilder.iconSlider() {
    styledDiv {
        css { +SliderStyles.iconSlider }
        attrs.classes = setOf("icon-wrapper")
        iconSliderDemo {
            attrs {
                min = 0
                max = 20
            }
        }
    }
}
