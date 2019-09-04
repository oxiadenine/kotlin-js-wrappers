package samples.select

import antd.select.SelectValue
import antd.select.option
import antd.select.select
import kotlinext.js.js
import kotlinx.html.id
import react.*
import react.dom.*

private fun handleChange(value: SelectValue, option: Any?) {
    console.log("selected $value")
}

fun RBuilder.automaticTokenization() {
    val children = (10..36).map { i ->
        buildElement {
            option {
                attrs.key = i.toString() + i
                +(i.toString() + i)
            }
        }
    }.toTypedArray()

    div("select-container") {
        attrs.id = "select-automatic-tokenization"
        select {
            attrs {
                mode = "tags"
                style = js { width = "100%" }
                onChange = ::handleChange
                tokenSeparators = arrayOf(",")
            }
            childList.add(children)
        }
    }
}
