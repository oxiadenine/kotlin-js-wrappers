package samples.spin

import antd.icon.icon
import antd.spin.spin
import kotlinext.js.js
import react.RBuilder
import react.buildElement
import styled.css
import styled.styledDiv

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
    styledDiv {
        css { +SpinStyles.customIndicator }
        spin {
            attrs.indicator = antIcon
        }
    }
}
