package samples.alert

import antd.alert.*
import react.*
import react.dom.*
import styled.*

fun RBuilder.style() {
    styledDiv {
        css { +AlertStyles.style }
        div {
            alert {
                attrs {
                    message = "Success Text"
                    type = "success"
                }
            }
            alert {
                attrs {
                    message = "Info Text"
                    type = "info"
                }
            }
            alert {
                attrs {
                    message = "Warning Text"
                    type = "warning"
                }
            }
            alert {
                attrs {
                    message = "Error Text"
                    type = "error"
                }
            }
        }
    }
}
