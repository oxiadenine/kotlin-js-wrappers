package samples.spin

import antd.spin.spin
import react.RBuilder
import styled.css
import styled.styledDiv

fun RBuilder.size() {
    styledDiv {
        css { +SpinStyles.size }
        spin {
            attrs.size = "small"
        }
        spin {}
        spin {
            attrs.size = "large"
        }
    }
}
