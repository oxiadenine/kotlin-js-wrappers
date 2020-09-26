package samples.skeleton

import antd.skeleton.SkeletonParagraphProps
import antd.skeleton.skeleton
import kotlinext.js.jsObject
import react.*
import styled.css
import styled.styledDiv

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
