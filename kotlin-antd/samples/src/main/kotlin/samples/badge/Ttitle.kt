package samples.badge

import antd.badge.badge
import kotlinx.html.classes
import kotlinx.html.id
import react.*
import react.dom.*

fun RBuilder.title() {
    div("badge-container") {
        attrs.id = "badge-title"
        div {
            badge {
                attrs {
                    count = 5
                    title = "Custom hover text"
                }
                a {
                    attrs {
                        href = "#"
                        classes = setOf("head-example")
                    }
                }
            }
        }
    }
}
