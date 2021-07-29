package samples.skeleton

import antd.skeleton.skeleton
import react.RBuilder
import styled.css
import styled.styledDiv

fun RBuilder.active() {
    styledDiv {
        css { +SkeletonStyles.active }
        skeleton {
            attrs.active = true
        }
    }
}
