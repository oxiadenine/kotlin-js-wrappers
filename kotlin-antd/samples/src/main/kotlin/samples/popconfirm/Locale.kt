package samples.popconfirm

import antd.popconfirm.popconfirm
import kotlinx.html.id
import react.RBuilder
import react.dom.a
import react.dom.div

fun RBuilder.locale() {
    div("popconfirm-container") {
        attrs.id = "popconfirm-locale"
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
