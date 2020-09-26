package samples.skeleton

import antd.skeleton.*
import kotlinext.js.*
import react.*
import styled.*

fun RBuilder.complex() {
    styledDiv {
        css { +SkeletonStyles.complex }
        skeleton {
            attrs {
                avatar = true
                paragraph = jsObject<SkeletonParagraphProps> { rows = 4 }
            }
        }
    }
}
