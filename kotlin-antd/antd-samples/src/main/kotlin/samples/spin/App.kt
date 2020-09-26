package samples.spin

import kotlinx.css.TextAlign
import kotlinx.css.background
import kotlinx.css.borderRadius
import kotlinx.css.margin
import kotlinx.css.marginRight
import kotlinx.css.padding
import kotlinx.css.px
import kotlinx.css.rgba
import kotlinx.css.textAlign
import react.*
import react.dom.*
import styled.StyleSheet
import styled.css
import styled.styledDiv

object SpinStyles : StyleSheet("spin", isStatic = true) {
    val container by css {}
    val basic by css {}
    val inside by css {
        descendants(".example") {
            margin(20.px, 0.px)
            padding(30.px, 50.px)
            background = rgba(0, 0, 0, 0.05).toString()
            borderRadius = 4.px
            textAlign = TextAlign.center
        }
    }
    val tip by css {}
    val customIndicator by css {}
    val size by css {
        descendants(".ant-spin") {
            marginRight = 16.px
        }
    }
    val nested by css {}
    val delayAndDebounce by css {}
}

class SpinApp : RComponent<RProps, RState>() {
    override fun RBuilder.render() {
        h2 { +"Spin" }
        styledDiv {
            css { +SpinStyles.container }
            basic()
            inside()
            tip()
            customIndicator()
            size()
            nested()
            delayAndDebounce()
        }
    }
}

fun RBuilder.spinApp() = child(SpinApp::class) {}
