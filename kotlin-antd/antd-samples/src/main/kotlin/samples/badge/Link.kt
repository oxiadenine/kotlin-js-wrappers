package samples.badge

import antd.badge.*
import kotlinx.html.*
import react.*
import react.dom.*
import styled.*

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
