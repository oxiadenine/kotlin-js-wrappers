package samples.empty

import antd.empty.empty
import kotlinx.html.id
import react.RBuilder
import react.dom.div

fun RBuilder.basic() {
    div("empty-container") {
        attrs.id = "empty-basic"
        empty {}
    }
}
