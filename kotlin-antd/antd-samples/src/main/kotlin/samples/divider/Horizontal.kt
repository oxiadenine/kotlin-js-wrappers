package samples.divider

import antd.divider.divider
import react.RBuilder
import react.dom.div
import react.dom.p
import styled.css
import styled.styledDiv

fun RBuilder.horizontal() {
    styledDiv {
        css { +DividerStyles.horizontal }
        div {
            p {
                +"""
                    Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed nonne merninisti licere mihi ista
                    probare, quae sunt a te dicta? Refert tamen, quo modo.
                """.trimIndent()
            }
            divider {}
            p {
                +"""
                    Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed nonne merninisti licere mihi ista
                    probare, quae sunt a te dicta? Refert tamen, quo modo.
                """.trimIndent()
            }
            divider {
                attrs.dashed = true
            }
            p {
                +"""
                    Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed nonne merninisti licere mihi ista
                    probare, quae sunt a te dicta? Refert tamen, quo modo.
                """.trimIndent()
            }
        }
    }
}
