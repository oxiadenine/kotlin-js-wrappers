package samples.badge

import antd.badge.badge
import antd.icon.icon
import kotlinx.html.id
import react.*
import react.dom.*

fun RBuilder.dot() {
    div("badge-container") {
        attrs.id = "badge-dot"
        div {
            badge {
                attrs.dot = true
                icon {
                    attrs.type = "notification"
                }
            }
            badge {
                attrs {
                    count = 0
                    dot = true
                }
                icon {
                    attrs.type = "notification"
                }
            }
            badge {
                attrs.dot = true
                a {
                    attrs.href = "#"
                    +"Link something"
                }
            }
        }
    }
}
