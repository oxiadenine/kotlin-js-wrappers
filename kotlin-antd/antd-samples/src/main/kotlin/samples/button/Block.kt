package samples.button

import antd.button.button
import react.*
import react.dom.*
import styled.css
import styled.styledDiv

fun RBuilder.block() {
    styledDiv {
        css { +ButtonStyles.block }
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
