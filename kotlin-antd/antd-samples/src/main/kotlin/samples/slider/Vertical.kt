package samples.slider

import antd.slider.SliderMarks
import antd.slider.slider
import kotlinext.js.js
import kotlinx.css.Float.left
import kotlinx.css.float
import kotlinx.css.height
import kotlinx.css.marginLeft
import kotlinx.css.px
import react.*
import react.dom.strong
import styled.StyleSheet
import styled.css
import styled.styledDiv

private object VerticalStyles : StyleSheet("vertical", isStatic = true) {
    val divStyle by css {
        float = left
        height = 300.px
        marginLeft = 70.px
    }
}

class VerticalDemo : RComponent<Props, State>() {
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
        styledDiv {
            css { height = 300.px }
            styledDiv {
                css { +VerticalStyles.divStyle }
                slider {
                    attrs {
                        vertical = true
                        defaultValue = 30
                    }
                }
            }
            styledDiv {
                css { +VerticalStyles.divStyle }
                slider {
                    attrs {
                        vertical = true
                        range = true
                        step = 10
                        defaultValue = arrayOf(20, 50)
                    }
                }
            }
            styledDiv {
                css { +VerticalStyles.divStyle }
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
    styledDiv {
        css { +SliderStyles.vertical }
        verticalDemo()
    }
}
