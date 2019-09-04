package samples.input

import antd.input.textArea
import kotlinx.html.id
import react.*
import react.dom.*

fun RBuilder.textarea() {
    div("input-container") {
        attrs.id = "input-textarea"
        textArea {
            attrs.rows = 4
        }
    }
}
