package samples.empty

import antd.empty.EmptyComponent
import antd.empty.empty
import kotlinx.html.id
import react.RBuilder
import react.dom.div

fun RBuilder.simple() {
    div("empty-container") {
        attrs.id = "empty-simple"
        empty {
            attrs.image = EmptyComponent.PRESENTED_IMAGE_SIMPLE
        }
    }
}
