package samples.input

import antd.input.input
import kotlinx.html.id
import react.*
import react.dom.*

fun RBuilder.basic() {
    div("input-container") {
        attrs.id = "input-basic"
        input {
            attrs.placeholder = "Basic usage"
        }
    }
}
