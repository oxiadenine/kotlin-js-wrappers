package samples.switch

import antd.icon.icon
import antd.switch.switch
import react.*
import react.dom.*
import styled.css
import styled.styledDiv

fun RBuilder.text() {
    styledDiv {
        css { +SwitchStyles.text }
        div {
            switch {
                attrs {
                    checkedChildren = "开"
                    unCheckedChildren = "关"
                    defaultChecked = true
                }
            }
            br {}
            switch {
                attrs {
                    checkedChildren = "1"
                    unCheckedChildren = "0"
                }
            }
            br {}
            switch {
                attrs {
                    checkedChildren = icon {
                        attrs.type = "check"
                    }
                    unCheckedChildren = icon {
                        attrs.type = "cross"
                    }
                    defaultChecked = true
                }
            }
        }
    }
}
