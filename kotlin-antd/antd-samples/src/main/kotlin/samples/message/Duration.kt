package samples.message

import antd.*
import antd.button.*
import antd.message.*
import react.*
import styled.*

private val success: MouseEventHandler<Any> = {
    message.success("This is a prompt message for success, and it will disappear in 10 seconds", 10)
}

fun RBuilder.duration() {
    styledDiv {
        css { +MessageStyles.duration }
        button {
            attrs.onClick = success
            +"Customized display duration"
        }
    }
}
