package samples.badge

import antd.badge.badge
import kotlinx.html.classes
import react.RBuilder
import react.dom.a
import react.dom.attrs
import react.dom.div
import styled.css
import styled.styledDiv

fun RBuilder.title() {
    styledDiv {
        css { +BadgeStyles.title }
        div {
            badge {
                attrs {
                    count = 5
                    title = "Custom hover text"
                }
                a {
                    attrs {
                        classes = setOf("head-example")
                        href = "#"
                    }
                }
            }
        }
    }
}
