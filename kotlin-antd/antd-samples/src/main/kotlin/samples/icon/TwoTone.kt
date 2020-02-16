package samples.icon

import antd.icon.icon
import kotlinx.html.id
import react.*
import react.dom.*

fun RBuilder.twoTone() {
    div("icon-container") {
        attrs.id = "icon-two-tone"
        div("icons-list") {
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
