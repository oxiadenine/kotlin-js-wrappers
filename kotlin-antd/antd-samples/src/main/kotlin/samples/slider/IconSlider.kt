package samples.slider

import antd.icon.icon
import antd.slider.SliderValue
import antd.slider.slider
import kotlinext.js.js
import kotlinx.html.classes
import react.*
import react.dom.*
import styled.css
import styled.styledDiv

interface IconSliderDemoProps : RProps {
    var min: Number
    var max: Number
}

interface IconSliderDemoState : RState {
    var value: SliderValue
}

class IconSliderDemo : RComponent<IconSliderDemoProps, IconSliderDemoState>() {
    private val handleChange: (SliderValue) -> Unit = {
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

        val sliderValue = (state.value as Number).toInt()

        val preColor = if (sliderValue >= sliderMid) "" else "rgba(0, 0, 0, .45)"
        val nextColor = if (sliderValue >= sliderMid) "rgba(0, 0, 0, .45)" else ""

        div("icon-wrapper") {
            icon {
                attrs {
                    style = js { color = nextColor }
                    type = "frown-o"
                }
            }
            slider {
                attrs {
                    min = sliderMin
                    max = sliderMax
                    onChange = handleChange
                    value = sliderValue
                }
            }
            icon {
                attrs {
                    style = js { color = preColor }
                    type = "smile-o"
                }
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
