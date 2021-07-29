package samples.button

import antd.button.button
import react.RBuilder
import styled.css
import styled.styledDiv

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
