package samples.rate

import antd.rate.*
import react.*
import styled.*

fun RBuilder.basic() {
    styledDiv {
        css { +RateStyles.basic }
        rate {}
    }
}
