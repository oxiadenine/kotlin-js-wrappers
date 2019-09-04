package samples.skeleton

import antd.skeleton.SkeletonParagraphProps
import antd.skeleton.skeleton
import kotlinext.js.jsObject
import kotlinx.html.id
import react.*
import react.dom.*

fun RBuilder.complex() {
    div("skeleton-container") {
        attrs.id = "skeleton-complex"
        skeleton {
            attrs {
                avatar = true
                paragraph = jsObject<SkeletonParagraphProps> { rows = 4 }
            }
        }
    }
}
