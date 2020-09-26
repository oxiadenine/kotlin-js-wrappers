package samples.slider

import kotlinx.css.Position
import kotlinx.css.color
import kotlinx.css.fontSize
import kotlinx.css.height
import kotlinx.css.left
import kotlinx.css.lineHeight
import kotlinx.css.margin
import kotlinx.css.marginBottom
import kotlinx.css.padding
import kotlinx.css.position
import kotlinx.css.properties.LineHeight
import kotlinx.css.px
import kotlinx.css.rgba
import kotlinx.css.right
import kotlinx.css.top
import kotlinx.css.width
import react.*
import react.dom.*
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

class SliderApp : RComponent<RProps, RState>() {
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
