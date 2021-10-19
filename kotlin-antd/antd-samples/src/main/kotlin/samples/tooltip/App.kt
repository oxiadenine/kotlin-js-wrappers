package samples.tooltip

import kotlinx.css.*
import react.RBuilder
import react.RComponent
import react.Props
import react.State
import react.dom.h2
import styled.StyleSheet
import styled.css
import styled.styledDiv

object TooltipStyles : StyleSheet("tooltip", isStatic = true) {
    val container by css {}
    val basic by css {}
    val arrowPointAtCenter by css {
        descendants(".ant-btn") {
            marginRight = 1.em
            marginBottom = 1.em
        }
    }
    val placement by css {
        descendants(".demo") {
            overflow = Overflow.auto
        }
        descendants(".ant-btn") {
            width = 70.px
            marginRight = 8.px
            marginBottom = 8.px
            padding(0.px)
            textAlign = TextAlign.center
        }
    }
    val autoAdjustOverflow by css {}
}

class TooltipApp : RComponent<Props, State>() {
    override fun RBuilder.render() {
        h2 { +"Tooltip" }
        styledDiv {
            css { +TooltipStyles.container }
            basic()
            arrowPointAtCenter()
            placement()
            autoAdjustOverflow()
        }
    }
}

fun RBuilder.tooltipApp() = child(TooltipApp::class) {}
