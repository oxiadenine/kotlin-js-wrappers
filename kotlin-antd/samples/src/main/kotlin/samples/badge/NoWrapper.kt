package samples.badge

import antd.badge.badge
import kotlinext.js.js
import kotlinx.html.id
import react.*
import react.dom.*

fun RBuilder.noWrapper() {
    div("badge-container") {
        attrs.id = "badge-no-wrapper"
        div {
            badge {
                attrs.count = 25
            }
            badge {
                attrs {
                    count = 4
                    style = js {
                        backgroundColor = "#fff"
                        color = "#999"
                        boxShadow = "0 0 0 1px #d9d9d9 inset"
                    }
                }
            }
            badge {
                attrs {
                    count = 109
                    style = js { backgroundColor = "#52c41a" }
                }
            }
        }
    }
}
