package samples.rate

import antd.rate.*
import react.*
import react.dom.*
import styled.*

fun RBuilder.clear() {
    styledDiv {
        css { +RateStyles.clear }
        div {
            rate {
                attrs.defaultValue = 3
            }
            +"allowClear: true"
            br {}
            rate {
                attrs {
                    allowClear = false
                    defaultValue = 3
                }
            }
            +"allowClear: false"
        }
    }
}
