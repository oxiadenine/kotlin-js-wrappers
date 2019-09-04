package samples.skeleton

import antd.skeleton.skeleton
import kotlinx.html.id
import react.*
import react.dom.*

fun RBuilder.basic() {
    div("skeleton-container") {
        attrs.id = "skeleton-basic"
        skeleton {}
    }
}
