package samples.message

import antd.MouseEventHandler
import antd.button.button
import antd.message.message
import kotlinx.html.id
import react.*
import react.dom.*
import kotlinx.browser.window

private val success: MouseEventHandler<Any> = {
    val hide = message.loading("Action in progress..", 0)

    // Dismiss manually and asynchronously
    window.setTimeout(hide, 2500)
}

fun RBuilder.loading() {
    div("message-container") {
        attrs.id = "message-loading"
        button {
            attrs.onClick = success
            +"Display a loading indicator"
        }
    }
}
