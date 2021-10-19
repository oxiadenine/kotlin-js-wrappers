package samples.grid

import kotlinx.css.*
import kotlinx.css.properties.LineHeight
import react.RBuilder
import react.RComponent
import react.Props
import react.State
import react.dom.h2
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
    val useBreakpoint by css {}
}

class GridApp : RComponent<Props, State>() {
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
            useBreakpoint()
        }
    }
}

fun RBuilder.gridApp() = child(GridApp::class) {}
