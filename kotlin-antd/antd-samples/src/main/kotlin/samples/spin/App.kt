package samples.spin

import kotlinx.css.*
import react.RBuilder
import react.RComponent
import react.Props
import react.State
import react.dom.h2
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

class SpinApp : RComponent<Props, State>() {
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
