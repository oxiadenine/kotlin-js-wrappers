package samples.skeleton

import antd.skeleton.*
import react.*
import styled.*

fun RBuilder.basic() {
    styledDiv {
        css { +SkeletonStyles.basic }
        skeleton {}
    }
}
