package samples.slider

import antd.slider.*
import kotlinext.js.*
import react.*
import react.dom.*
import styled.*

class MarkDemo : RComponent<RProps, RState>() {
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
            h4 { +"included=true" }
            slider {
                attrs {
                    marks = sliderMarks.unsafeCast<SliderMarks>()
                    defaultValue = 37
                }
            }
            slider {
                attrs {
                    range = true
                    marks = sliderMarks.unsafeCast<SliderMarks>()
                    defaultValue = arrayOf(26, 37)
                }
            }
            h4 { +"included=false" }
            slider {
                attrs {
                    marks = sliderMarks.unsafeCast<SliderMarks>()
                    included = false
                    defaultValue = 37
                }
            }
            h4 { +"marks & step" }
            slider {
                attrs {
                    marks = sliderMarks.unsafeCast<SliderMarks>()
                    step = 10
                    defaultValue = 37
                }
            }
            h4 { +"step=null" }
            slider {
                attrs {
                    marks = sliderMarks.unsafeCast<SliderMarks>()
                    step = null
                    defaultValue = 37
                }
            }
        }
    }
}

fun RBuilder.markDemo() = child(MarkDemo::class) {}

fun RBuilder.mark() {
    styledDiv {
        css { +SliderStyles.mark }
        markDemo()
    }
}
