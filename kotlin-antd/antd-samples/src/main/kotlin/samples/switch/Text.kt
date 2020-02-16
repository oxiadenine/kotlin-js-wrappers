package samples.switch

import antd.icon.icon
import antd.switch.switch
import kotlinx.html.id
import react.*
import react.dom.*

fun RBuilder.text() {
    div("switch-container") {
        attrs.id = "switch-text"
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
