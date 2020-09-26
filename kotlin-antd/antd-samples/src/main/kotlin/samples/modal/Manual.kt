package samples.modal

import antd.MouseEventHandler
import antd.button.button
import antd.modal.ModalComponent
import kotlinext.js.jsObject
import react.*
import kotlinx.browser.window
import styled.css
import styled.styledDiv

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
    styledDiv {
        css { +ModalStyles.manual }
        button {
            attrs.onClick = countDown
            +"Open modal to close in 5s"
        }
    }
}
