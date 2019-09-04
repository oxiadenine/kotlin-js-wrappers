package samples.icon

import antd.icon.icon
import kotlinx.html.id
import react.*
import react.dom.*

fun RBuilder.basic() {
    div("icon-container") {
        attrs.id = "icon-basic"
        div("icons-list") {
            icon {
                attrs.type = "home"
            }
            icon {
                attrs {
                    type = "setting"
                    theme = "filled"
                }
            }
            icon {
                attrs {
                    type = "smile"
                    theme = "outlined"
                }
            }
            icon {
                attrs {
                    type = "sync"
                    spin = true
                }
            }
            icon {
                attrs {
                    type = "smile"
                    rotate = 180
                }
            }
            icon {
                attrs.type = "loading"
            }
        }
    }
}
