package samples.popover

import antd.button.button
import antd.popover.popover
import kotlinx.html.id
import react.*
import react.dom.*

private val text = buildElement {
    span { +"Title" }
}

private val contentElement = buildElement {
    div {
        p { +"Content" }
        p { +"Content" }
    }
}

fun RBuilder.arrowPointAtCenter() {
    div("popover-container") {
        attrs.id = "popover-arrow-point-at-center"
        div {
            popover {
                attrs {
                    placement = "topLeft"
                    title = text
                    content = contentElement
                }
                button { +"Align edge / 边缘对齐" }
            }
            popover {
                attrs {
                    placement = "topLeft"
                    title = text
                    content = content
                    arrowPointAtCenter = true
                }
                button { +"Arrow points to center / 箭头指向中心" }
            }
        }
    }
}
