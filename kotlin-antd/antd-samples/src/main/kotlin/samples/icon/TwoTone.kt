package samples.icon

import antd.icon.icon
import kotlinx.html.classes
import react.*
import react.dom.*
import styled.css
import styled.styledDiv

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
