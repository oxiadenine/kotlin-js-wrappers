package samples.badge

import antd.badge.*
import kotlinext.js.*
import react.*
import react.dom.*
import styled.*

fun RBuilder.noWrapper() {
    styledDiv {
        css { +BadgeStyles.noWrapper }
        div {
            badge {
                attrs.count = 25
            }
            badge {
                attrs {
                    count = 4
                    style = js {
                        backgroundColor = "#fff"
                        color = "#999"
                        boxShadow = "0 0 0 1px #d9d9d9 inset"
                    }
                }
            }
            badge {
                attrs {
                    count = 109
                    style = js { backgroundColor = "#52c41a" }
                }
            }
        }
    }
}
