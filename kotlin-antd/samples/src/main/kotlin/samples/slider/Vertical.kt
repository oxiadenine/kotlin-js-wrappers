package samples.slider

import antd.slider.SliderMarks
import antd.slider.slider
import kotlinext.js.js
import kotlinx.html.id
import react.*
import react.dom.*

class VerticalDemo : RComponent<RProps, RState>() {
    private val divStyle = js {
        float = "left"
        height = 300
        marginLeft = 70
    }

    private val sliderMarks = js {}

    init {
        sliderMarks[0] = "0°C"
        sliderMarks[26] = "26°C"
        sliderMarks[37] = "37°C"
        sliderMarks[100] = js {
            style = js {
                color = "#f50"
            }
            label = buildElement {
                strong { +"100°" }
            }
        }
    }

    override fun RBuilder.render() {
        div {
            attrs.jsStyle = js { height = 300 }
            div {
                attrs.jsStyle = divStyle
                slider {
                    attrs {
                        vertical = true
                        defaultValue = 30
                    }
                }
            }
            div {
                attrs.jsStyle = divStyle
                slider {
                    attrs {
                        vertical = true
                        range = true
                        step = 10
                        defaultValue = arrayOf(20, 50)
                    }
                }
            }
            div {
                attrs.jsStyle = divStyle
                slider {
                    attrs {
                        vertical = true
                        range = true
                        marks = sliderMarks.unsafeCast<SliderMarks>()
                        defaultValue = arrayOf(26, 37)
                    }
                }
            }
        }
    }
}

fun RBuilder.verticalDemo() = child(VerticalDemo::class) {}

fun RBuilder.vertical() {
    div("slider-container") {
        attrs.id = "slider-vertical"
        verticalDemo()
    }
}
