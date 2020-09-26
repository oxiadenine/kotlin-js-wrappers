package samples.skeleton

import antd.skeleton.*
import react.*
import styled.*

fun RBuilder.active() {
    styledDiv {
        css { +SkeletonStyles.active }
        skeleton {
            attrs.active = true
        }
    }
}
