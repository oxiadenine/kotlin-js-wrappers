package samples.modal

import antd.*
import antd.button.*
import antd.modal.*
import kotlinext.js.*
import kotlinx.browser.*
import react.*
import styled.*

private val countDown: MouseEventHandler<Any> = {
    var secondsToGo = 5

    val modal = ModalComponent.success(jsObject {
        title = "This is a notification message"
        content = "This modal will be destroyed after $secondsToGo second"
    })

    window.setInterval({
        secondsToGo -= 1

        modal.update(jsObject {
            content = "This modal will be destroyed after $secondsToGo second"
        })
    }, 1000)

    window.setTimeout({ modal.destroy() }, secondsToGo * 1000)
}

fun RBuilder.manual() {
    styledDiv {
        css { +ModalStyles.manual }
        button {
            attrs.onClick = countDown
            +"Open modal to close in 5s"
        }
    }
}
