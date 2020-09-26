package samples.alert

import antd.alert.*
import react.*
import styled.*

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
