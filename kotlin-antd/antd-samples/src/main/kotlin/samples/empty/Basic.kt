package samples.empty

import antd.empty.empty
import react.RBuilder
import styled.css
import styled.styledDiv

fun RBuilder.basic() {
    styledDiv {
        css { +EmptyStyles.basic }
        empty {}
    }
}
