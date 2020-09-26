package samples.input

import kotlinx.css.*
import kotlinx.css.properties.*
import react.*
import react.dom.*
import styled.*

object InputStyles : StyleSheet("input", isStatic = true) {
    val container by css {}
    val basic by css {}
    val addon by css {}
    val searchInput by css {}
    val autosizeTextarea by css {}
    val presuffix by css {
        descendants(".anticon-close-circle") {
            color = Color("#ccc")
            fontSize = 12.px
            cursor = Cursor.pointer
            transition("color", 0.3.s)
            hover {
                color = Color("#999")
            }
            active {
                color = Color("#666")
            }
        }
    }
    val allowClear by css {}
    val size by css {
        descendants(".example-input") {
            descendants(".ant-input") {
                width = 200.px
                margin(0.px, 8.px, 8.px, 0.px)
            }
        }
    }
    val group by css {}
    val textarea by css {}
    val passwordInput by css {}
    val textareaResize by css {}
}

class InputApp : RComponent<RProps, RState>() {
    override fun RBuilder.render() {
        h2 { +"Input" }
        styledDiv {
            css { +InputStyles.container }
            basic()
            addon()
            searchInput()
            autosizeTextarea()
            presuffix()
            allowClear()
            size()
            group()
            textarea()
            passwordInput()
            textareaResize()
        }
    }
}

fun RBuilder.inputApp() = child(InputApp::class) {}
