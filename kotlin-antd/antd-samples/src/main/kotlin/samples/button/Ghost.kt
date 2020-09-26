package samples.button

import antd.button.button
import kotlinext.js.js
import react.*
import react.dom.*
import styled.css
import styled.styledDiv

fun RBuilder.ghost() {
    styledDiv {
        css { +ButtonStyles.ghost }
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
