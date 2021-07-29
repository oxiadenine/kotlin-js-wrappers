package samples.switch

import antd.switch.switch
import react.RBuilder
import react.dom.br
import react.dom.div
import styled.css
import styled.styledDiv

fun RBuilder.size() {
    styledDiv {
        css { +SwitchStyles.size }
        div {
            switch {
                attrs.defaultChecked = true
            }
            br {}
            switch {
                attrs {
                    size = "small"
                    defaultChecked = true
                }
            }
        }
    }
}
