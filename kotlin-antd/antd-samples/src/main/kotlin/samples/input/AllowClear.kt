package samples.input

import antd.ChangeEventHandler
import antd.input.input
import org.w3c.dom.HTMLInputElement
import react.RBuilder
import styled.css
import styled.styledDiv

private val handleChange: ChangeEventHandler<HTMLInputElement> = {
    console.log(it)
}

fun RBuilder.allowClear() {
    styledDiv {
        css { +InputStyles.allowClear }
        input {
            attrs {
                placeholder = "Input with clear icon"
                allowClear = true
                onChange = handleChange
            }
        }
    }
}
