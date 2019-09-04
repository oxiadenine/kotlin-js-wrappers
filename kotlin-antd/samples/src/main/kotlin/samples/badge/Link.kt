package samples.badge

import antd.badge.badge
import kotlinx.html.classes
import kotlinx.html.id
import react.*
import react.dom.*

fun RBuilder.link() {
    div("badge-container") {
        attrs.id = "badge-link"
        a {
            attrs.href = "#"
            badge {
                attrs.count = 5
                span {
                    attrs.classes = setOf("head-example")
                }
            }
        }
    }
}
