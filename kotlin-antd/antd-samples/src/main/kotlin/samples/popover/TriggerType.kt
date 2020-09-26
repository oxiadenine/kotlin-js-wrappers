package samples.popover

import antd.button.button
import antd.popover.*
import react.*
import react.dom.*
import styled.*

private val contentElement = buildElement {
    div {
        p { +"Content" }
        p { +"Content" }
    }
}

fun RBuilder.triggerType() {
    styledDiv {
        css { +PopoverStyles.triggerType }
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
