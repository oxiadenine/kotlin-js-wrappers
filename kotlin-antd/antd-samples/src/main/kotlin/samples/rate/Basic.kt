package samples.rate

import antd.rate.rate
import react.RBuilder
import styled.css
import styled.styledDiv

fun RBuilder.basic() {
    styledDiv {
        css { +RateStyles.basic }
        rate {}
    }
}
