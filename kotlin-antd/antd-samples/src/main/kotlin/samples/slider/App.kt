package samples.slider

import kotlinx.css.*
import kotlinx.css.properties.LineHeight
import react.RBuilder
import react.RComponent
import react.Props
import react.State
import react.dom.h2
import styled.StyleSheet
import styled.css
import styled.styledDiv

object SliderStyles : StyleSheet("slider", isStatic = true) {
    val container by css {}
    val basic by css {
        descendants(".ant-slider") {
            marginBottom = 16.px
        }
    }
    val iconSlider by css {
        descendants(".icon-wrapper") {
            position = Position.relative
            padding(0.px, 30.px)
            descendants(".anticon") {
                position = Position.absolute
                top = (-2).px
                width = 16.px
                height = 16.px
                lineHeight = LineHeight("1")
                fontSize = 16.px
                color = rgba(0, 0, 0, .25)
                firstChild {
                    left = 0.px
                }
                lastChild {
                    right = 0.px
                }
            }
        }
    }
    val event by css {}
    val vertical by css {}
    val inputNumber by css {}
    val tipFormatter by css {}
    val mark by css {
        descendants("h4") {
            margin(0.px, 0.px, 16.px)
        }
        descendants(".ant-slider-with-marks") {
            marginBottom = 44.px
        }
    }
    val showTooltip by css {}
}

class SliderApp : RComponent<Props, State>() {
    override fun RBuilder.render() {
        h2 { +"Slider" }
        styledDiv {
            css { +SliderStyles.container }
            basic()
            iconSlider()
            event()
            vertical()
            inputNumber()
            tipFormatter()
            mark()
            showTooltip()
        }
    }
}

fun RBuilder.sliderApp() = child(SliderApp::class) {}
