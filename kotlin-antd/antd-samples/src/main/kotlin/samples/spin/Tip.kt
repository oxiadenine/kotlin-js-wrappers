package samples.spin

import antd.alert.alert
import antd.spin.spin
import kotlinx.html.id
import react.RBuilder
import react.dom.div

fun RBuilder.tip() {
    div("spin-container") {
        attrs.id = "spin-tip"
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
