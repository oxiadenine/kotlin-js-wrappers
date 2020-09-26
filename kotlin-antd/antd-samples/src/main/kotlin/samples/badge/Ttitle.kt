package samples.badge

import antd.badge.badge
import kotlinx.html.classes
import react.*
import react.dom.*
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
