package samples.select

import kotlinx.css.margin
import kotlinx.css.px
import react.RBuilder
import react.RComponent
import react.Props
import react.State
import react.dom.h2
import styled.StyleSheet
import styled.css
import styled.styledDiv

object SelectStyles : StyleSheet("select", isStatic = true) {
    val container by css {}
    val basic by css {}
    val multiple by css {}
    val optionLabelProp by css {}
    val optgroup by css {}
    val automaticTokenization by css {}
    val customDropdownMenu by css {}
    val search by css {}
    val size by css {
        descendants(".ant-select") {
            margin(0.px)
        }
    }
    val tags by css {}
    val coordinate by css {}
    val labelInValue by css {}
    val selectUsers by css {}
    val hideSelected by css {}
    val suffix by css {}
    val bordered by css {}
    val customTagRender by css {}
}

class SelectApp : RComponent<Props, State>() {
    override fun RBuilder.render() {
        h2 { +"Select" }
        styledDiv {
            css { +SelectStyles.container }
            basic()
            multiple()
            optionLabelProp()
            optGroup()
            automaticTokenization()
            customDropdownMenu()
            search()
            size()
            tags()
            coordinate()
            labelInValue()
            selectUsers()
            hideSelected()
            suffix()
            bordered()
            customTagRender()
        }
    }
}

fun RBuilder.selectApp() = child(SelectApp::class) {}
