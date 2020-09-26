package samples.message

import antd.MouseEventHandler
import antd.button.button
import antd.message.message
import react.*
import react.dom.*
import styled.css
import styled.styledDiv

private val success: MouseEventHandler<Any> = {
    message.success("This is a message of success")
}

private val error: MouseEventHandler<Any> = {
    message.error("This is a message of error")
}

private val warning: MouseEventHandler<Any> = {
    message.warning("This is a message of warning")
}

fun RBuilder.other() {
    styledDiv {
        css { +MessageStyles.other }
        div {
            button {
                attrs.onClick = success
                +"Success"
            }
            button {
                attrs.onClick = error
                +"Error"
            }
            button {
                attrs.onClick = warning
                +"Warning"
            }
        }
    }
}
