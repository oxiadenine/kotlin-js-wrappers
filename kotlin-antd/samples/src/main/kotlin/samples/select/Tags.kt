package samples.select

import antd.select.SelectValue
import antd.select.select
import antd.select.option
import kotlinext.js.js
import kotlinx.html.id
import react.*
import react.dom.*

private val children = (10..36).map { i ->
    buildElement {
        option {
            attrs { key = i.toString() + i }
            +(i.toString() + i)
        }
    }
}.toTypedArray()

private fun handleChange(value: SelectValue, option: Any) {
    console.log("selected $value")
}

fun RBuilder.tags() {
    div("select-container") {
        attrs.id = "select-tags"
        select {
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
