package samples.message

import antd.MouseEventHandler
import antd.button.button
import antd.message.message
import kotlinx.browser.window
import react.RBuilder
import styled.css
import styled.styledDiv

private val success: MouseEventHandler<Any> = {
    val hide = message.loading("Action in progress..", 0)

    window.setTimeout(hide, 2500)
}

fun RBuilder.loading() {
    styledDiv {
        css { +MessageStyles.loading }
        button {
            attrs.onClick = success
            +"Display a loading indicator"
        }
    }
}
