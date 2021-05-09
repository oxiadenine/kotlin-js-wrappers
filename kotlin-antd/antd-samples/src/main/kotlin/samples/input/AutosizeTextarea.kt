package samples.input

import antd.input.*
import antd.input.textArea
import kotlinext.js.*
import kotlinx.css.margin
import kotlinx.css.px
import react.*
import react.dom.*
import styled.*

fun RBuilder.autosizeTextarea() {
    styledDiv {
        css { +InputStyles.autosizeTextarea }
        div {
            textArea {
                attrs {
                    placeholder = "Autosize height based on content lines"
                    autoSize = true
                }
            }
            styledDiv {
                css { margin(24.px,  0.px) }
            }
            textArea {
                attrs {
                    placeholder = "Autosize height with minimum and maximum number of lines"
                    autoSize = jsObject<AutoSizeType> {
                        minRows = 2
                        maxRows = 6
                    }
                }
            }
        }
    }
}
