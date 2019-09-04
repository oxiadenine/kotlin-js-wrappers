package samples.button

import antd.button.button
import kotlinext.js.js
import kotlinx.html.id
import react.*
import react.dom.*

fun RBuilder.ghost() {
    div("button-container") {
        attrs.id = "button-ghost"
        div {
            attrs.jsStyle = js {
                background = "rgb(190, 200, 200)"
                padding = "26px 16px 16px"
            }
            button {
                attrs {
                    type = "primary"
                    ghost = true
                }
                +"Primary"
            }
            button {
                attrs.ghost = true
                +"Default"
            }
            button {
                attrs {
                    type = "dashed"
                    ghost = true
                }
                +"Dashed"
            }
            button {
                attrs {
                    type = "danger"
                    ghost = true
                }
                +"Danger"
            }
            button {
                attrs {
                    type = "link"
                    ghost = true
                }
                +"Link"
            }
        }
    }
}
