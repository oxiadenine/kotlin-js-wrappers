package samples.select

import antd.select.SelectComponent
import antd.select.select
import antd.select.option
import kotlinext.js.js
import kotlinx.html.id
import react.*
import react.dom.*

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
    div("select-container") {
        attrs.id = "select-multiple"
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
