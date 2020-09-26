package samples.icon

import antd.icon.*
import kotlinx.html.*
import react.*
import react.dom.*
import styled.*

fun RBuilder.twoTone() {
    styledDiv {
        css { +IconStyles.twoTone }
        div {
            attrs.classes = setOf("icons-list")
            icon {
                attrs {
                    type = "smile"
                    theme = "twoTone"
                }
            }
            icon {
                attrs {
                    type = "heart"
                    theme = "twoTone"
                    twoToneColor = "#eb2f96"
                }
            }
            icon {
                attrs {
                    type = "check-circle"
                    theme = "twoTone"
                    twoToneColor = "#52c41a"
                }
            }
        }
    }
}
