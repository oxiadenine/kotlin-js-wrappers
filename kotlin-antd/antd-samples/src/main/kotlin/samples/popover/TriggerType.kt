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

fun RBuilder.triggerType() {
    div("popover-container") {
        attrs.id = "popover-trigger-type"
        div {
            popover {
                attrs {
                    content = contentElement
                    title = "Title"
                    trigger = "hover"
                }
                button { +"Hover me" }
            }
            popover {
                attrs {
                    content = contentElement
                    title = "Title"
                    trigger = "focus"
                }
                button { +"Focus me" }
            }
            popover {
                attrs {
                    content = contentElement
                    title = "Title"
                    trigger = "click"
                }
                button { +"Click me" }
            }
        }
    }
}
