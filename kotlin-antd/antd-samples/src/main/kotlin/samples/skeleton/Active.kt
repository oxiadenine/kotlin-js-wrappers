package samples.skeleton

import antd.skeleton.skeleton
import kotlinx.html.id
import react.*
import react.dom.*

fun RBuilder.active() {
    div("skeleton-container") {
        attrs.id = "skeleton-active"
        skeleton {
            attrs.active = true
        }
    }
}
