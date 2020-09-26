package samples.cascader

import kotlinx.css.Color
import kotlinx.css.Cursor
import kotlinx.css.Outline
import kotlinx.css.backgroundColor
import kotlinx.css.color
import kotlinx.css.cursor
import kotlinx.css.outline
import kotlinx.css.properties.Timing
import kotlinx.css.properties.s
import kotlinx.css.properties.transition
import react.*
import react.dom.*
import styled.StyleSheet
import styled.css
import styled.styledDiv

object CascaderStyles : StyleSheet("cascader", isStatic = true) {
    val container by css {
        descendants("a") {
            color = Color("#1890ff")
            backgroundColor = Color.transparent
            outline = Outline.none
            cursor = Cursor.pointer
            transition("color", 3.s, Timing.ease)
        }
    }
    val basic by css {}
    val customTrigger by css {}
    val disabledOption by css {}
    val size by css {}
    val search by css {}
    val fieldNames by css {}
    val defaultValue by css {}
    val hover by css {}
    val changeOnSelect by css {}
    val customRender by css {}
    val lazy by css {}
    val suffix by css {}
}

class CascaderApp : RComponent<RProps, RState>() {
    override fun RBuilder.render() {
        h2 { +"Cascader" }
        styledDiv {
            css { +CascaderStyles.container }
            basic()
            customTrigger()
            disabledOption()
            size()
            search()
            fieldNames()
            defaultValue()
            hover()
            changeOnSelection()
            customRender()
            lazy()
            suffix()
        }
    }
}

fun RBuilder.cascaderApp() = child(CascaderApp::class) {}
