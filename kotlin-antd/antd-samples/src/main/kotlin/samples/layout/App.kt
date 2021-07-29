package samples.layout

import kotlinx.css.*
import kotlinx.css.properties.LineHeight
import kotlinx.css.properties.s
import kotlinx.css.properties.transition
import react.RBuilder
import react.RComponent
import react.RProps
import react.State
import react.dom.h2
import styled.StyleSheet
import styled.css
import styled.styledDiv

object LayoutStyles : StyleSheet("layout", isStatic = true) {
    val container by css {
        descendants(".logo") {
            width = 120.px
            height = 30.px
            margin(16.px, 24.px, 16.px, 0.px)
            background = rgba(255, 255, 255, .2).toString()
            float = Float.left
        }
        descendants(".trigger") {
            padding(0.px, 24.px)
            fontSize = 18.px
            lineHeight = LineHeight("64px")
            cursor = Cursor.pointer
            transition("color", .3.s)
            hover {
                color = Color("#1890ff")
            }
        }
    }
    val basic by css {
        descendants(".ant-layout") {
            textAlign = TextAlign.center
        }
        descendants(".ant-layout-header") {
            background = "#7dbcea"
            color = Color.white
        }
        descendants(".ant-layout-content") {
            minHeight = 120.px
            background = rgba(16, 142, 233, 1.0).toString()
            color = Color.white
            lineHeight = LineHeight("120px")
        }
        descendants(".ant-layout-footer") {
            background = "#7dbcea"
            color = Color.white
        }
        descendants(".ant-layout-sider") {
            background = "#3ba0e9"
            color = Color.white
            lineHeight = LineHeight("120px")
        }
    }
    val top by css {}
    val topSide2 by css {}
    val topSide by css {}
    val side by css {
        descendants(".logo") {
            height = 32.px
            margin(16.px)
        }
    }
    val customTrigger by css {
        descendants(".logo") {
            height = 32.px
            margin(16.px)
        }
    }
    val customTriggerDebug by css {
        descendants(".logo") {
            height = 32.px
            margin(16.px)
        }
    }
    val responsive by css {
        descendants(".logo") {
            height = 32.px
            margin(16.px)
        }
    }
    val fixed by css {}
    val fixedSider by css {
        descendants(".logo") {
            height = 32.px
            margin(16.px)
        }
    }
}

class LayoutApp : RComponent<RProps, State>() {
    override fun RBuilder.render() {
        h2 { +"Layout" }
        styledDiv {
            css { +LayoutStyles.container }
            basic()
            top()
            topSide2()
            topSide()
            side()
            customTrigger()
            responsive()
            fixed()
            fixedSider()
        }
    }
}

fun RBuilder.layoutApp() = child(LayoutApp::class) {}
