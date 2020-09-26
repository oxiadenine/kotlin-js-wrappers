package samples.divider

import antd.divider.divider
import react.RBuilder
import react.dom.a
import react.dom.div
import styled.css
import styled.styledDiv

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
