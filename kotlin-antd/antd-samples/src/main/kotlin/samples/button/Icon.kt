package samples.button

import antd.button.button
import kotlinx.html.id
import react.*
import react.dom.*

fun RBuilder.icon() {
    div("button-container") {
        attrs.id = "button-icon"
        div {
            button {
                attrs {
                    type = "primary"
                    shape = "circle"
                    icon = "search"
                }
            }
            button {
                attrs {
                    type = "primary"
                    icon = "search"
                }
                +"Search"
            }
            button {
                attrs {
                    shape = "circle"
                    icon = "search"
                }
            }
            button {
                attrs.icon = "search"
                +"Search"
            }
            br {}
            button {
                attrs {
                    shape = "circle"
                    icon = "search"
                }
            }
            button {
                attrs.icon = "search"
                +"Search"
            }
            button {
                attrs {
                    type = "dashed"
                    shape = "circle"
                    icon = "search"
                }
            }
            button {
                attrs {
                    type = "dashed"
                    icon = "search"
                }
                +"Search"
            }
        }
    }
}
