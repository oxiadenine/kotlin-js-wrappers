package samples.select

import antd.select.SelectComponent
import antd.select.option
import antd.select.select
import kotlinext.js.js
import react.RBuilder
import react.buildElement
import styled.css
import styled.styledDiv

private val handleChange = { value: String, _: Any? ->
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
                onChange = handleChange
                tokenSeparators = arrayOf(",")
            }
            childList.add(children)
        }
    }
}
