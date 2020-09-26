package samples.cascader

import kotlinx.css.*
import kotlinx.css.properties.*
import react.*
import react.dom.*
import styled.*

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
