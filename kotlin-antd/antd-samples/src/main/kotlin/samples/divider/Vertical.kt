package samples.divider

import antd.divider.*
import react.*
import react.dom.*
import styled.*

fun RBuilder.vertical() {
    styledDiv {
        css { +DividerStyles.vertical }
        div {
            +"Text"
            divider {
                attrs.type = "vertical"
            }
            a {
                attrs.href = "#"
                +"Link"
            }
            divider {
                attrs.type = "vertical"
            }
            a {
                attrs.href = "#"
                +"Link"
            }
        }
    }
}
