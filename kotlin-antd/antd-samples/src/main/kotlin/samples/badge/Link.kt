package samples.badge

import antd.badge.badge
import kotlinx.html.classes
import react.RBuilder
import react.dom.a
import react.dom.span
import styled.css
import styled.styledDiv

fun RBuilder.link() {
    styledDiv {
        css { +BadgeStyles.link }
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
