package samples.badge

import antd.badge.badge
import kotlinx.html.classes
import react.*
import react.dom.*
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
