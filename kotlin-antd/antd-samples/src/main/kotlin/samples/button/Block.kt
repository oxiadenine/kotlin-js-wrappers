package samples.button

import antd.button.button
import kotlinx.html.id
import react.*
import react.dom.*

fun RBuilder.block() {
    div("button-container") {
        attrs.id = "button-block"
        div {
            button {
                attrs {
                    type = "primary"
                    block = true
                }
                +"Primary"
            }
            button {
                attrs.block = true
                +"Default"
            }
            button {
                attrs {
                    type = "dashed"
                    block = true
                }
                +"Dashed"
            }
            button {
                attrs {
                    type = "danger"
                    block = true
                }
                +"Danger"
            }
            button {
                attrs {
                    type = "link"
                    block = true
                }
                +"Link"
            }
        }
    }
}
