package samples.empty

import antd.empty.*
import react.*
import styled.*

fun RBuilder.simple() {
    styledDiv {
        css { +EmptyStyles.simple }
        empty {
            attrs.image = EmptyComponent.PRESENTED_IMAGE_SIMPLE
        }
    }
}
