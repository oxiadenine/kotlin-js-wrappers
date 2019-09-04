package samples.input

import antd.input.input
import kotlinx.html.id
import react.*
import react.dom.*

fun RBuilder.size() {
    div("input-container") {
        attrs.id = "input-size"
        div("example-input") {
            input {
                attrs {
                    size = "large"
                    placeholder = "large size"
                }
            }
            input {
                attrs.placeholder = "default size"
            }
            input {
                attrs {
                    size = "small"
                    placeholder = "small size"
                }
            }
        }
    }
}
