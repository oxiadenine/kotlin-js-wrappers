package samples.spin

import antd.alert.alert
import antd.spin.spin
import react.RBuilder
import styled.css
import styled.styledDiv

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
