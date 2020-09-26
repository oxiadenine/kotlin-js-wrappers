package samples.popconfirm

import antd.icon.icon
import antd.popconfirm.popconfirm
import kotlinext.js.js
import react.RBuilder
import react.buildElement
import react.dom.a
import styled.css
import styled.styledDiv

fun RBuilder.icon() {
    styledDiv {
        css { +PopconfirmStyles.icon }
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
