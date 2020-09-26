package samples.select

import antd.select.SelectComponent
import antd.select.select
import antd.select.option
import kotlinext.js.js
import react.*
import styled.css
import styled.styledDiv

private val children = (10..36).map { i ->
    buildElement {
        option {
            attrs.key = i.toString(36) + i
            +(i.toString(36) + i)
        }
    }
}.toTypedArray()

private fun handleChange(value: Array<String>, option: Any) {
    console.log("selected $value")
}

fun RBuilder.multiple() {
    styledDiv {
        css { +SelectStyles.multiple }
        select<Array<String>, SelectComponent<Array<String>>> {
            attrs {
                mode = "multiple"
                style = js { width = "100%" }
                placeholder = "Please select"
                defaultValue = arrayOf("a10", "a12")
                onChange = ::handleChange
            }
            childList.add(children)
        }
    }
}
