package samples.pageheader

import kotlinx.css.BorderStyle
import kotlinx.css.Display
import kotlinx.css.FlexBasis
import kotlinx.css.LinearDimension
import kotlinx.css.Position
import kotlinx.css.QuotedString
import kotlinx.css.TextAlign
import kotlinx.css.VerticalAlign
import kotlinx.css.WhiteSpace
import kotlinx.css.content
import kotlinx.css.display
import kotlinx.css.flex
import kotlinx.css.lineHeight
import kotlinx.css.margin
import kotlinx.css.marginBottom
import kotlinx.css.marginRight
import kotlinx.css.minWidth
import kotlinx.css.paddingBottom
import kotlinx.css.paddingLeft
import kotlinx.css.paddingTop
import kotlinx.css.position
import kotlinx.css.properties.LineHeight
import kotlinx.css.properties.border
import kotlinx.css.px
import kotlinx.css.rgb
import kotlinx.css.textAlign
import kotlinx.css.top
import kotlinx.css.verticalAlign
import kotlinx.css.whiteSpace
import kotlinx.css.width
import react.*
import react.dom.*
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
}

class PageHeaderApp : RComponent<RProps, RState>() {
    override fun RBuilder.render() {
        h2 { +"PageHeader" }
        styledDiv {
            css { +PageHeaderStyles.container }
            basic()
            content()
            actions()
            breadcrumb()
        }
    }
}

fun RBuilder.pageHeaderApp() = child(PageHeaderApp::class) {}
