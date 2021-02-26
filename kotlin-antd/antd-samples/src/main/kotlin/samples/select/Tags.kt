package samples.select

import antd.select.*
import kotlinext.js.*
import react.*
import styled.*

private val children = (10..36).map { i ->
    buildElement {
        option {
            attrs { key = i.toString() + i }
            +(i.toString() + i)
        }
    }
}.toTypedArray()

private val handleChange = { value: Array<String>, _: Any ->
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
                onChange = handleChange
            }
            childList.add(children)
        }
    }
}
