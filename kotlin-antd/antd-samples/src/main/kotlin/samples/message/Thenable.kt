package samples.message

import antd.MouseEventHandler
import antd.button.button
import antd.message.message
import react.RBuilder
import styled.css
import styled.styledDiv

private val success: MouseEventHandler<Any> = {
    message.loading("Action in progress..", 2.5).promise
        .then { message.success("Loading finished", 2.5) }
        .then { message.info("Loading finished is finished", 2.5) }
}

fun RBuilder.thenable() {
    styledDiv {
        css { +MessageStyles.thenable }
        button {
            attrs.onClick = success
            +"Display a sequence of message"
        }
    }
}
