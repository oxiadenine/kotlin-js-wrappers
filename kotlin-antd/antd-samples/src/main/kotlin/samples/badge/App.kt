package samples.badge

import kotlinx.css.*
import kotlinx.css.properties.*
import react.*
import react.dom.*
import styled.*

object BadgeStyles : StyleSheet("badge", isStatic = true) {
    val container by css {
        descendants(".ant-badge") {
            not(".ant-badge-not-a-wrapper") {
                marginRight = 20.px
            }
        }
        descendants(".head-example") {
            display = Display.inlineBlock
            height = 42.px
            width = 42.px
            lineHeight = LineHeight("40px")
            borderRadius = 4.px
            background = "#eee"
        }
    }
    val basic by css {}
    val overflow by css {}
    val link by css {}
    val status by css {}
    val noWrapper by css {
        descendants(".ant-badge-not-a-wrapper") {
            not(".ant-badge-status") {
                marginRight = 8.px
            }
        }
    }
    val dot by css {}
    val change by css {}
    val title by css {}
    val colorful by css {
        descendants(".ant-tag") {
            marginBottom = 8.px
        }
    }
}

class BadgeApp : RComponent<RProps, RState>() {
    override fun RBuilder.render() {
        h2 { +"Badge" }
        styledDiv {
            css { +BadgeStyles.container }
            basic()
            overflow()
            link()
            status()
            noWrapper()
            dot()
            change()
            title()
            colorful()
        }
    }
}

fun RBuilder.badgeApp() = child(BadgeApp::class) {}
