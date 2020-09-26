package samples.rate

import antd.rate.*
import react.*
import styled.*

fun RBuilder.disabled() {
    styledDiv {
        css { +RateStyles.disabled }
        rate {
            attrs {
                disabled = true
                defaultValue = 2
            }
        }
    }
}
