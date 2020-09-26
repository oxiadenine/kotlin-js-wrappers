package samples.empty

import antd.empty.EmptyComponent
import antd.empty.empty
import react.RBuilder
import styled.css
import styled.styledDiv

fun RBuilder.simple() {
    styledDiv {
        css { +EmptyStyles.simple }
        empty {
            attrs.image = EmptyComponent.PRESENTED_IMAGE_SIMPLE
        }
    }
}
