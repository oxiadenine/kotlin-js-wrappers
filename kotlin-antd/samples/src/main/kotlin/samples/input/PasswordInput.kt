package samples.input

import antd.input.password
import kotlinx.html.id
import react.RBuilder
import react.dom.div

fun RBuilder.passwordInput() {
    div("input-container") {
        attrs.id = "input-password-input"
        password {
            attrs.placeholder = "input password"
        }
    }
}
