package samples.popover

import kotlinx.css.*
import react.RBuilder
import react.RComponent
import react.Props
import react.State
import react.dom.h2
import styled.StyleSheet
import styled.css
import styled.styledDiv

object PopoverStyles : StyleSheet("popover", isStatic = true) {
    val container by css {}
    val basic by css {
        descendants("p") {
            margin(0.px)
        }
    }
    val placement by css {
        descendants(".demo") {
            overflow = Overflow.auto
        }
        children(".ant-btn") {
            width = 70.px
            marginRight = 8.px
            marginBottom = 8.px
            padding(0.px)
            textAlign = TextAlign.center
        }
    }
    val arrowPointAtCenter by css {}
    val triggerType by css {}
    val control by css {}
    val hoverWithClick by css {}
}

class PopoverApp : RComponent<Props, State>() {
    override fun RBuilder.render() {
        h2 { +"Popover" }
        styledDiv {
            css { +PopoverStyles.container }
            basic()
            placement()
            arrowPointAtCenter()
            triggerType()
            control()
            hoverWithClick()
        }
    }
}

fun RBuilder.popoverApp() = child(PopoverApp::class) {}
