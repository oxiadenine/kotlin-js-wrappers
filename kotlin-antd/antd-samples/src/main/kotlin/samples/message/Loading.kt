package samples.message

import antd.*
import antd.button.*
import antd.message.*
import kotlinx.browser.*
import react.*
import styled.*

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
