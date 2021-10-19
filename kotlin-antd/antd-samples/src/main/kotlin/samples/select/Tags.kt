package samples.select

import antd.select.SelectComponent
import antd.select.option
import antd.select.select
import kotlinext.js.js
import react.RBuilder
import react.ReactNode
import react.buildElement
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
            childList.add(children.unsafeCast<ReactNode>())
        }
    }
}
