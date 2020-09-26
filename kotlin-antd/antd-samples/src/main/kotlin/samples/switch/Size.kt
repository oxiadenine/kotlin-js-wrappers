package samples.switch

import antd.switch.switch
import react.*
import react.dom.*
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
