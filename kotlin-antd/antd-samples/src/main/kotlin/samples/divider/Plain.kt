package samples.divider

import antd.divider.*
import react.*
import react.dom.*
import styled.*

fun RBuilder.plain() {
    styledDiv {
        css { +DividerStyles.plain }
        div {
            p {
                +"""
                    Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed nonne merninisti licere mihi ista
                    probare, quae sunt a te dicta? Refert tamen, quo modo.
                """.trimIndent()
            }
            divider {
                attrs.plain = true
                +"Text"
            }
            p {
                +"""
                    Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed nonne merninisti licere mihi ista
                    probare, quae sunt a te dicta? Refert tamen, quo modo.
                """.trimIndent()
            }
            divider {
                attrs {
                    orientation = "left"
                    plain = true
                }
                +"Left text"
            }
            p {
                +"""
                    Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed nonne merninisti licere mihi ista
                    probare, quae sunt a te dicta? Refert tamen, quo modo.
                """.trimIndent()
            }
            divider {
                attrs {
                    orientation = "right"
                    plain = true
                }
                +"Right text"
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
