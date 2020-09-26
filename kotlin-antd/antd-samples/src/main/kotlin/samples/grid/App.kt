package samples.grid

import kotlinx.css.BoxSizing
import kotlinx.css.Color
import kotlinx.css.Display
import kotlinx.css.LinearDimension
import kotlinx.css.TextAlign
import kotlinx.css.background
import kotlinx.css.border
import kotlinx.css.borderRadius
import kotlinx.css.boxSizing
import kotlinx.css.color
import kotlinx.css.display
import kotlinx.css.fontSize
import kotlinx.css.height
import kotlinx.css.lineHeight
import kotlinx.css.marginBottom
import kotlinx.css.marginTop
import kotlinx.css.minHeight
import kotlinx.css.padding
import kotlinx.css.properties.LineHeight
import kotlinx.css.px
import kotlinx.css.rgba
import kotlinx.css.textAlign
import kotlinx.css.width
import react.*
import react.dom.*
import styled.StyleSheet
import styled.css
import styled.styledDiv

object GridStyles : StyleSheet("grid", isStatic = true) {
    val container by css {
        descendants(".gutter-box") {
            minHeight = 30.px
            padding(5.px, 0.px)
            background = "#00a0e9"
            color = Color.white
            textAlign = TextAlign.center
        }
        descendants(".ant-row") {
            children("div") {
                minHeight = 30.px
                marginTop = 8.px
                marginBottom = 8.px
                padding(5.px, 0.px)
                color = Color.white
                textAlign = TextAlign.center
                borderRadius = 0.px
            }
            not(".gutter-row") {
                padding(16.px, 0.px)
                background = "#00a0e9"
                nthChild("2n+1") {
                    background = rgba(0, 160, 233, 0.7).toString()
                }
            }
        }
        descendants(".ant-row-flex") {
            children("div") {
                minHeight = 30.px
                marginTop = 8.px
                marginBottom = 8.px
                padding(5.px, 0.px)
                color = Color.white
                textAlign = TextAlign.center
                borderRadius = 0.px
            }
            not(".gutter-row") {
                padding(16.px, 0.px)
                background = "#00a0e9"
                nthChild("2n+1") {
                    background = rgba(0, 160, 233, 0.7).toString()
                }
            }
        }
        descendants(".ant-col-12") {
            display = Display.block
            width = LinearDimension("50%")
            boxSizing = BoxSizing.borderBox
        }
    }
    val basic by css {}
    val gutter by css {
        descendants(".gutter-example") {
            descendants(".ant-row") {
                children("div") {
                    background = Color.transparent.toString()
                    border = "0"
                }
            }
        }
        descendants(".gutter-box") {
            padding(5.px, 0.px)
            background = "#00A0E9"
        }
    }
    val offset by css {}
    val sort by css {}
    val flex by css {}
    val flexAlign by css {}
    val flexOrder by css {}
    val responsive by css {}
    val responsiveMore by css {}
    val playground by css {
        descendants("[class^=\"ant-col-\"]") {
            background = Color.transparent.toString()
            border = "0"
            children("div") {
                height = 120.px
                lineHeight = LineHeight("120px")
                background = "#00A0E9"
                fontSize = 13.px
            }
        }
        descendants("pre") {
            padding(8.px, 16.px)
            background = "#f9f9f9"
            borderRadius = 6.px
            fontSize = 13.px
        }
    }
}

class GridApp : RComponent<RProps, RState>() {
    override fun RBuilder.render() {
        h2 { +"Grid" }
        styledDiv {
            css { +GridStyles.container }
            basic()
            gutter()
            offset()
            sort()
            flex()
            flexAlign()
            flexOrder()
            responsive()
            responsiveMore()
            playground()
        }
    }
}

fun RBuilder.gridApp() = child(GridApp::class) {}
