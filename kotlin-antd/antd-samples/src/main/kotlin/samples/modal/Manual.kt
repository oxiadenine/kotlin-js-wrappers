package samples.modal

import antd.MouseEventHandler
import antd.button.button
import antd.modal.ModalComponent
import kotlinext.js.jsObject
import kotlinx.html.id
import react.*
import react.dom.*
import kotlinx.browser.window

private val countDown: MouseEventHandler<Any> = {
    var secondsToGo = 5

    val modal = ModalComponent.success(jsObject {
        title = "This is a notification message"
        content = "This modal will be destroyed after $secondsToGo second"
    })

    window.setInterval({
        secondsToGo -= 1

        modal.update(jsObject {
            content =  "This modal will be destroyed after $secondsToGo second"
        })
    }, 1000)

    window.setTimeout({ modal.destroy() }, secondsToGo * 1000)
}

fun RBuilder.manual() {
    div("modal-container") {
        attrs.id = "modal-manual"
        button {
            attrs.onClick = countDown
            +"Open modal to close in 5s"
        }
    }
}
