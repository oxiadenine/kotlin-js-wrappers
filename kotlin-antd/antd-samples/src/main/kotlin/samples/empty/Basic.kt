package samples.empty

import antd.empty.*
import react.*
import styled.*

fun RBuilder.basic() {
    styledDiv {
        css { +EmptyStyles.basic }
        empty {}
    }
}
