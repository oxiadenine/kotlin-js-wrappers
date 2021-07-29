package samples.switch

import antd.icon.checkOutlined
import antd.icon.closeOutlined
import antd.switch.switch
import react.RBuilder
import react.buildElement
import react.dom.br
import react.dom.div
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
                    checkedChildren = buildElement {
                        checkOutlined {}
                    }
                    unCheckedChildren = buildElement {
                        closeOutlined {}
                    }
                    defaultChecked = true
                }
            }
        }
    }
}
