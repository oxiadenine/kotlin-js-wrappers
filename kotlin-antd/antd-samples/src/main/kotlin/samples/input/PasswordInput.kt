package samples.input

import antd.input.*
import react.*
import styled.*

fun RBuilder.passwordInput() {
    styledDiv {
        css { +InputStyles.passwordInput }
        password {
            attrs.placeholder = "input password"
        }
    }
}
