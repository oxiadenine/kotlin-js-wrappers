package samples.badge

import antd.badge.badge
import kotlinx.html.classes
import react.RBuilder
import react.dom.a
import styled.css
import styled.styledDiv

fun RBuilder.offset() {
    styledDiv {
        css { +BadgeStyles.offset }
        badge {
            attrs {
                count = 5
                offset = arrayOf(10, 10)
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
