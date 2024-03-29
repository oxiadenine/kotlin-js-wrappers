package samples.popover

import antd.button.button
import antd.popover.popover
import react.RBuilder
import react.buildElement
import react.dom.div
import react.dom.p
import react.dom.span
import styled.css
import styled.styledDiv

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
    styledDiv {
        css { +PopoverStyles.arrowPointAtCenter }
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
