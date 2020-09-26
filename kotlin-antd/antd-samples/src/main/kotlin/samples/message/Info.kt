package samples.message

import antd.MouseEventHandler
import antd.button.button
import antd.message.message
import react.*
import styled.css
import styled.styledDiv

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
