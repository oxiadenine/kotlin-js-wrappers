package samples.input

import antd.input.AutoSizeType
import antd.input.textArea
import kotlinext.js.js
import kotlinext.js.jsObject
import kotlinx.html.id
import react.*
import react.dom.*

fun RBuilder.autosizeTextarea() {
    div("input-container") {
        attrs.id = "input-autosize-textarea"
        div {
            textArea {
                attrs {
                    placeholder = "Autosize height based on content lines"
                    autosize = true
                }
            }
            div {
                attrs.jsStyle = js { margin = "24px 0" }
            }
            textArea {
                attrs {
                    placeholder = "Autosize height with minimum and maximum number of lines"
                    autosize = jsObject<AutoSizeType> {
                        minRows = 2
                        maxRows = 6
                    }
                }
            }
        }
    }
}
