package samples.button

import antd.button.*
import react.*
import styled.*

fun RBuilder.basic() {
    styledDiv {
        css { +ButtonStyles.basic }
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
