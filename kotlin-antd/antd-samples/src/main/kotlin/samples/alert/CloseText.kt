package samples.alert

import antd.alert.alert
import react.RBuilder
import styled.css
import styled.styledDiv

fun RBuilder.closeText() {
    styledDiv {
        css { +AlertStyles.closeText }
        alert {
            attrs {
                message = "Info Text"
                type = "info"
                closeText = "Close Now"
            }
        }
    }
}
