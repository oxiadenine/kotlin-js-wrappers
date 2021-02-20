package samples.space

import antd.button.button
import antd.space.space
import react.RBuilder
import react.dom.div
import react.dom.span
import styled.css
import styled.styledDiv

fun RBuilder.align() {
    styledDiv {
        css { +SpaceStyles.align }
        div(classes = "space-align-container") {
            div(classes = "space-align-block") {
                space {
                    attrs.align = "center"
                    +"center"
                    button {
                        attrs.type = "primary"
                        +"Primary"
                    }
                    span(classes = "mock-block") { +"Block" }
                }
            }
            div(classes = "space-align-block") {
                space {
                    attrs.align = "start"
                    +"start"
                    button {
                        attrs.type = "primary"
                        +"Primary"
                    }
                    span(classes = "mock-block") { +"Block" }
                }
            }
            div(classes = "space-align-block") {
                space {
                    attrs.align = "end"
                    +"end"
                    button {
                        attrs.type = "primary"
                        +"Primary"
                    }
                    span(classes = "mock-block") { +"Block" }
                }
            }
            div(classes = "space-align-block") {
                space {
                    attrs.align = "baseline"
                    +"baseline"
                    button {
                        attrs.type = "primary"
                        +"Primary"
                    }
                    span(classes = "mock-block") { +"Block" }
                }
            }
        }
    }
}
