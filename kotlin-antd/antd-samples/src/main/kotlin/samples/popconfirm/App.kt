package samples.popconfirm

import kotlinx.css.*
import react.RBuilder
import react.RComponent
import react.RProps
import react.State
import react.dom.h2
import styled.StyleSheet
import styled.css
import styled.styledDiv

object PopconfirmStyles : StyleSheet("popconfirm", isStatic = true) {
    val container by css {}
    val basic by css {}
    val placement by css {
        descendants(".demo") {
            overflow = Overflow.auto
        }
        descendants(".ant-popover-wrap") {
            children("a") {
                marginRight = 8.px
            }
        }
        children(".ant-btn") {
            marginRight = 8.px
            marginBottom = 8.px
        }
    }
    val icon by css {}
    val locale by css {}
    val dynamicTrigger by css {}
}

class PopconfirmApp : RComponent<RProps, State>() {
    override fun RBuilder.render() {
        h2 { +"Popconfirm" }
        styledDiv {
            css { +PopconfirmStyles.container }
            basic()
            placement()
            icon()
            locale()
            dynamicTrigger()
        }
    }
}

fun RBuilder.popconfirmApp() = child(PopconfirmApp::class) {}
