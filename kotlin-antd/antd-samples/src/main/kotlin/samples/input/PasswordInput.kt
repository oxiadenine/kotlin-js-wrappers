package samples.input

import antd.input.password
import react.RBuilder
import styled.css
import styled.styledDiv

fun RBuilder.passwordInput() {
    styledDiv {
        css { +InputStyles.passwordInput }
        password {
            attrs.placeholder = "input password"
        }
    }
}
