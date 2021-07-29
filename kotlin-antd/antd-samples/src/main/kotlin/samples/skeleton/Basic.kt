package samples.skeleton

import antd.skeleton.skeleton
import react.RBuilder
import styled.css
import styled.styledDiv

fun RBuilder.basic() {
    styledDiv {
        css { +SkeletonStyles.basic }
        skeleton {}
    }
}
