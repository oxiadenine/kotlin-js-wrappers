package samples.input

import antd.input.*
import react.*
import styled.*

fun RBuilder.textarea() {
    styledDiv {
        css { +InputStyles.textarea }
        textArea {
            attrs.rows = 4
        }
    }
}
