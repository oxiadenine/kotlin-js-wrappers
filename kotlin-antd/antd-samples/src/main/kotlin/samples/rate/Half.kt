package samples.rate

import antd.rate.*
import react.*
import styled.*

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
