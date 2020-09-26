package samples.spin

import antd.spin.*
import react.*
import styled.*

fun RBuilder.basic() {
    styledDiv {
        css { +SpinStyles.basic }
        spin {}
    }
}
