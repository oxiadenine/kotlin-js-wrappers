package samples.popconfirm

import kotlinx.css.*
import react.*
import react.dom.*
import styled.*

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

class PopconfirmApp : RComponent<RProps, RState>() {
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
