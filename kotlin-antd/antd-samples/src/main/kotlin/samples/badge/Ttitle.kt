package samples.badge

import antd.badge.*
import kotlinx.html.*
import react.*
import react.dom.*
import styled.*

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
