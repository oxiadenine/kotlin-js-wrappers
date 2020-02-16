package samples.popover

import antd.button.button
import antd.popover.popover
import kotlinx.html.id
import react.*
import react.dom.*

private val contentElement = buildElement {
    div {
        p { +"Content" }
        p { +"Content" }
    }
}

fun RBuilder.basic() {
    div("popover-container") {
        attrs.id = "popover-basic"
        popover {
            attrs {
                content = contentElement
                title = "Title"
            }
            button {
                attrs.type = "primary"
                +"Hover me"
            }
        }
    }
}
