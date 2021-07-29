package samples.modal

import antd.MouseEventHandler
import antd.button.button
import antd.modal.ModalComponent
import kotlinext.js.jsObject
import kotlinx.browser.window
import react.RBuilder
import styled.css
import styled.styledDiv
import kotlin.js.Promise
import kotlin.random.Random

private val showConfirm: MouseEventHandler<Any> = {
    ModalComponent.confirm(jsObject {
        title = "Do you want to delete these items?"
        content = "When clicked the OK button, this dialog will be closed after 1 second"
        onOk = {
            Promise<Boolean> { resolve, reject ->
                window.setTimeout({
                    if (Random.nextDouble() > 0.5) resolve(true) else reject(Error())
                }, 1000)
            }.catch { console.log("Oops errors!") }
        }
        onCancel = { Promise.resolve(false) }
    })
}

fun RBuilder.confirmRouter() {
    styledDiv {
        css { +ModalStyles.confirmRouter }
        button {
            attrs.onClick = showConfirm
            +"Confirm"
        }
    }
}
