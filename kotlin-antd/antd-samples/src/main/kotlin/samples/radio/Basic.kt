package samples.radio

import antd.radio.radio
import react.RBuilder
import styled.css
import styled.styledDiv

fun RBuilder.basic() {
    styledDiv {
        css { +RadioStyles.basic }
        radio { +"Radio" }
    }
}
