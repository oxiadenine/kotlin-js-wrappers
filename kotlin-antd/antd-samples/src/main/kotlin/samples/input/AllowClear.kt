package samples.input

import antd.ChangeEventHandler
import antd.input.input
import kotlinx.html.id
import org.w3c.dom.HTMLInputElement
import react.RBuilder
import react.dom.div

private val handleChange: ChangeEventHandler<HTMLInputElement> = {
    console.log(it)
}

fun RBuilder.allowClear() {
    div("input-container") {
        attrs.id = "input-allow-clear"
        input {
            attrs {
                placeholder = "Input with clear icon"
                allowClear = true
                onChange = handleChange
            }
        }
    }
}
