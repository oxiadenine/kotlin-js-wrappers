package samples.input

import antd.input.input
import kotlinx.html.*
import react.*
import react.dom.*
import styled.*

fun RBuilder.size() {
    styledDiv {
        css { +InputStyles.size }
        div {
            attrs.classes = setOf("example-input")
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
