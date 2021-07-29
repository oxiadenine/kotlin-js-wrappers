package samples.rate

import antd.rate.rate
import react.RBuilder
import react.dom.br
import react.dom.div
import styled.css
import styled.styledDiv

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
