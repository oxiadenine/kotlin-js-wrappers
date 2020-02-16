package samples.button

import antd.button.button
import kotlinext.js.js
import kotlinx.html.id
import react.*
import react.dom.*

fun RBuilder.disabled() {
    div("button-container") {
        attrs.id = "button-disabled"
        div {
            button {
                attrs.type = "primary"
                +"Primary"
            }
            button {
                attrs {
                    type = "primary"
                    disabled = true
                }
                +"Primary(disabled)"
            }
            br {}
            button { +"Default" }
            button {
                attrs.disabled = true
                +"Default(disabled)"
            }
            br {}
            button {
                attrs.type = "dashed"
                +"Dashed"
            }
            button {
                attrs {
                    type = "dashed"
                    disabled = true
                }
                +"Dashed(disabled)"
            }
            button {
                attrs.type = "link"
                +"Link"
            }
            button {
                attrs {
                    type = "link"
                    disabled = true
                }
                +"Link(disabled)"
            }
            div {
                attrs.jsStyle = js {
                    padding = "8px 8px 8px 8px"
                    background = "rgb(190, 200, 200)"
                }
                button {
                    attrs.ghost = true
                    +"Ghost"
                }
                button {
                    attrs {
                        ghost = true
                        disabled = true
                    }
                    +"Ghost(disabled)"
                }
            }
        }
    }
}
