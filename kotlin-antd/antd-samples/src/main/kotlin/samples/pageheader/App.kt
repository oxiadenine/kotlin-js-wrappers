package samples.pageheader

import kotlinx.css.*
import kotlinx.css.properties.LineHeight
import kotlinx.css.properties.border
import react.RBuilder
import react.RComponent
import react.RProps
import react.State
import react.dom.h2
import styled.StyleSheet
import styled.css
import styled.styledDiv

object PageHeaderStyles : StyleSheet("page-header", isStatic = true) {
    val container by css {
        descendants(".wrap") {
            display = Display.flex
        }
        descendants(".content") {
            flex(1.0, 1.0, FlexBasis.zero)
        }
    }
    val basic by css {
        descendants(".ant-page-header") {
            border(1.px, BorderStyle.solid, rgb(235, 237, 240))
        }
    }
    val content by css {
        descendants(".extraContent") {
            minWidth = 240.px
            textAlign = TextAlign.right
        }
        descendants(".contentLink") {
            paddingTop = 16.px
            descendants("a") {
                display = Display.inlineBlock
                verticalAlign = VerticalAlign.textTop
                marginRight = 32.px
                descendants("img") {
                    marginRight = 8.px
                }
            }
        }
    }
    val actions by css {
        descendants(".content") {
            flex(1.0, 1.0, FlexBasis.zero)
            descendants(",padding") {
                paddingLeft = 40.px
            }
            descendants(".description") {
                display = Display.table
                descendants("term") {
                    display = Display.tableCell
                    marginRight = 8.px
                    marginBottom = 8.px
                    lineHeight = LineHeight("20px")
                    whiteSpace = WhiteSpace.nowrap
                    after {
                        position = Position.relative
                        top = (-0.5).px
                        margin(0.px, 8.px, 0.px, 2.px)
                        content = QuotedString(":")
                    }
                }
                descendants(".detail") {
                    display = Display.tableCell
                    width = LinearDimension("100%")
                    paddingBottom = 8.px
                    lineHeight = LineHeight("20px")
                }
            }
        }
        descendants(".extraContent") {
            minWidth = 240.px
            textAlign = TextAlign.right
        }
    }
    val breadcrumb by css {}
    val ghost by css {
        descendants(".site-page-header-ghost-wrapper") {
            padding(all = 24.px)
            backgroundColor = Color("#f5f5f5")
        }
    }
}

class PageHeaderApp : RComponent<RProps, State>() {
    override fun RBuilder.render() {
        h2 { +"PageHeader" }
        styledDiv {
            css { +PageHeaderStyles.container }
            basic()
            content()
            actions()
            breadcrumb()
            ghost()
        }
    }
}

fun RBuilder.pageHeaderApp() = child(PageHeaderApp::class) {}
