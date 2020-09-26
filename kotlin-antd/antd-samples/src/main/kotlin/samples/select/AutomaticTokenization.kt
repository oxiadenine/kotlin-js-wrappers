package samples.select

import antd.select.*
import kotlinext.js.*
import react.*
import styled.*

private fun handleChange(value: String, option: Any?) {
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

    styledDiv {
        css { +SelectStyles.automaticTokenization }
        select<String, SelectComponent<String>> {
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
