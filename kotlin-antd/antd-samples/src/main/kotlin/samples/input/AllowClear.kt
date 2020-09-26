package samples.input

import antd.*
import antd.input.*
import org.w3c.dom.*
import react.*
import styled.*

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
