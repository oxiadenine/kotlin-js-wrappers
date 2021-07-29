package samples.rate

import antd.rate.rate
import react.RBuilder
import styled.css
import styled.styledDiv

fun RBuilder.half() {
    styledDiv {
        css { +RateStyles.half }
        rate {
            attrs {
                allowHalf = true
                defaultValue = 2.5
            }
        }
    }
}
