package samples.input

import antd.input.AutoSizeType
import antd.input.textArea
import kotlinext.js.js
import kotlinext.js.jsObject
import react.*
import react.dom.*
import styled.css
import styled.styledDiv

fun RBuilder.autosizeTextarea() {
    styledDiv {
        css { +InputStyles.autosizeTextarea }
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
