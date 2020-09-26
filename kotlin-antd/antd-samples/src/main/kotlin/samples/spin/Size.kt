package samples.spin

import antd.spin.*
import react.*
import styled.*

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
