package samples.popconfirm

import antd.popconfirm.*
import react.*
import react.dom.*
import styled.*

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
