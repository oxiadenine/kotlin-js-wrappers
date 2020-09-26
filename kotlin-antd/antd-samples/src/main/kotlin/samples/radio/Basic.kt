package samples.radio

import antd.radio.*
import react.*
import styled.*

fun RBuilder.basic() {
    styledDiv {
        css { +RadioStyles.basic }
        radio { +"Radio" }
    }
}
