package samples.input

import antd.input.input
import react.*
import styled.css
import styled.styledDiv

fun RBuilder.basic() {
    styledDiv {
        css { +InputStyles.basic }
        input {
            attrs.placeholder = "Basic usage"
        }
    }
}
