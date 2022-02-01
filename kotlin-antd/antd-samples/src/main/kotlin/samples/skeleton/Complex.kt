package samples.skeleton

import antd.skeleton.SkeletonParagraphProps
import antd.skeleton.skeleton
import kotlinext.js.jso
import react.RBuilder
import styled.css
import styled.styledDiv

fun RBuilder.complex() {
    styledDiv {
        css { +SkeletonStyles.complex }
        skeleton {
            attrs {
                avatar = true
                paragraph = jso<SkeletonParagraphProps> { rows = 4 }
            }
        }
    }
}
