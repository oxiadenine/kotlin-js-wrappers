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

fun RBuilder.basic() {
    styledDiv {
        css { +PopoverStyles.basic }
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
