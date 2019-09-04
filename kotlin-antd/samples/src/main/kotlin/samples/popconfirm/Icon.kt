package samples.popconfirm

import antd.icon.icon
import antd.popconfirm.popconfirm
import kotlinext.js.js
import kotlinx.html.id
import react.RBuilder
import react.buildElement
import react.dom.a
import react.dom.div

fun RBuilder.icon() {
    div("popconfirm-container") {
        attrs.id = "popconfirm-icon"
        popconfirm {
            attrs {
                title = "Are you sure？"
                icon = buildElement {
                    icon {
                        attrs {
                            type = "question-circle-o"
                            style = js { color = "red" }
                        }
                    }
                }
            }
            a {
                attrs.href = "#"
                +"Delete"
            }
        }
    }
}
