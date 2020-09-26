package samples.popconfirm

import antd.popconfirm.popconfirm
import react.RBuilder
import react.dom.a
import styled.css
import styled.styledDiv

fun RBuilder.locale() {
    styledDiv {
        css { +PopconfirmStyles.locale }
        popconfirm {
            attrs {
                title = "Are you sure？"
                okText = "Yes"
                cancelText = "No"
            }
            a {
                attrs.href = "#"
                +"Delete"
            }
        }
    }
}
