package samples.alert

import antd.alert.*
import react.*
import styled.*

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
