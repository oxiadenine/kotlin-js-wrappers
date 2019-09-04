package samples.button

import antd.button.button
import kotlinx.html.id
import react.*
import react.dom.*

fun RBuilder.basic() {
    div("button-container") {
        attrs.id = "button-basic"
        button {
            attrs.type = "primary"
            +"Primary"
        }
        button { +"Default" }
        button {
            attrs.type = "dashed"
            +"Dashed"
        }
        button {
            attrs.type = "danger"
            +"Danger"
        }
        button {
            attrs.type = "link"
            +"Link"
        }
    }
}
