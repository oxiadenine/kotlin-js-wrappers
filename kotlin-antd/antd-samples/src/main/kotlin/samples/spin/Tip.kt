package samples.spin

import antd.alert.*
import antd.spin.*
import react.*
import styled.*

fun RBuilder.tip() {
    styledDiv {
        css { +SpinStyles.tip }
        spin {
            attrs.tip = "Loading..."
            alert {
                attrs {
                    message = "Alert message title"
                    description = "Further details about the context of this alert."
                    type = "info"
                }
            }
        }
    }
}
