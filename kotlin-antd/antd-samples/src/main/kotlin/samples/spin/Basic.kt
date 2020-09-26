package samples.spin

import antd.spin.spin
import react.RBuilder
import styled.css
import styled.styledDiv

fun RBuilder.basic() {
    styledDiv {
        css { +SpinStyles.basic }
        spin {}
    }
}
