package samples.input

import antd.input.AutoSizeType
import antd.input.textArea
import kotlinext.js.jsObject
import kotlinx.css.margin
import kotlinx.css.px
import react.RBuilder
import react.dom.div
import styled.css
import styled.styledDiv

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
