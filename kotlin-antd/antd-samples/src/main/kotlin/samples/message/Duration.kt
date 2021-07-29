package samples.message

import antd.MouseEventHandler
import antd.button.button
import antd.message.message
import react.RBuilder
import styled.css
import styled.styledDiv

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
