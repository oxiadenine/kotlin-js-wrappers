package samples.alert

import antd.alert.alert
import react.RBuilder
import styled.css
import styled.styledDiv

fun RBuilder.basic() {
    styledDiv {
        css { +AlertStyles.basic }
        alert {
            attrs {
                message = "Success Text"
                type = "success"
            }
        }
    }
}
