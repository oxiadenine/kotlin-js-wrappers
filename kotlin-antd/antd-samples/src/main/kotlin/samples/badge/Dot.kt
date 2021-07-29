package samples.badge

import antd.badge.badge
import antd.icon.notificationOutlined
import react.RBuilder
import react.dom.a
import react.dom.div
import styled.css
import styled.styledDiv

fun RBuilder.dot() {
    styledDiv {
        css { +BadgeStyles.dot }
        div {
            badge {
                attrs.dot = true
                notificationOutlined {}
            }
            badge {
                attrs {
                    count = 0
                    dot = true
                }
                notificationOutlined {}
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
