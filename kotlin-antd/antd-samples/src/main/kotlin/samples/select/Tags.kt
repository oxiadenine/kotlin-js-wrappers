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
            attrs { key = i.toString() + i }
            +(i.toString() + i)
        }
    }
}.toTypedArray()

private fun handleChange(value: Array<String>, option: Any) {
    console.log("selected $value")
}

fun RBuilder.tags() {
    styledDiv {
        css { +SelectStyles.tags }
        select<Array<String>, SelectComponent<Array<String>>> {
            attrs {
                mode = "tags"
                style = js { width = "100%" }
                placeholder = "Tags Mode"
                onChange = ::handleChange
            }
            childList.add(children)
        }
    }
}
