package samples.select

import antd.select.*
import kotlinext.js.*
import react.*
import styled.*

private val children = (10..36).map { i ->
    buildElement {
        option {
            attrs.key = i.toString(36) + i
            +(i.toString(36) + i)
        }
    }
}.toTypedArray()

private val handleChange = { value: Array<String>, _: Any ->
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
                onChange = handleChange
            }
            childList.add(children)
        }
    }
}
