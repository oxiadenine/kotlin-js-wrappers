package samples.message

import antd.*
import antd.button.*
import antd.message.*
import react.*
import styled.*

private val info: MouseEventHandler<Any> = {
    message.info("This is a normal message")
}

fun RBuilder.info() {
    styledDiv {
        css { +MessageStyles.info }
        button {
            attrs {
                type = "primary"
                onClick = info
            }
            +"Display normal message"
        }
    }
}
