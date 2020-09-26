package samples.input

import antd.input.*
import react.*
import styled.*

fun RBuilder.basic() {
    styledDiv {
        css { +InputStyles.basic }
        input {
            attrs.placeholder = "Basic usage"
        }
    }
}
