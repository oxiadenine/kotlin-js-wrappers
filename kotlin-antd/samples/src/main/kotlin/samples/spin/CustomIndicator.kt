package samples.spin

import antd.icon.icon
import antd.spin.spin
import kotlinext.js.js
import kotlinx.html.id
import react.RBuilder
import react.buildElement
import react.dom.div

private val antIcon = buildElement {
    icon {
        attrs {
            type = "loading"
            style = js { fontSize = 24 }
            spin = true
        }
    }
}

fun RBuilder.customIndicator() {
    div("spin-container") {
        attrs.id = "spin-custom-indicator"
        spin {
            attrs.indicator = antIcon
        }
    }
}
