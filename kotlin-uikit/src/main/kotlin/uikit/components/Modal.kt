package uikit.components

import uikit.Component
import kotlin.js.Promise

external interface Modal {
    fun alert(message: String, options: dynamic = definedExternally): ModalPromise
    fun confirm(message: String, options: dynamic = definedExternally): ModalPromise
    fun prompt(message: String, options: dynamic = definedExternally): ModalPromise
    fun dialog(message: String, options: dynamic = definedExternally): ModalPromise
}

external class ModalPromise : Promise<Unit> {
    val dialog: ModalComponent
}

external interface ModalComponent : Component {
    fun show()
    fun hide()
}

external interface ModalOptions {
    var escClose: Boolean?
    var bgClose: Boolean?
    var stack: Boolean?
    var container: String?
    var clsPage: String?
    var clsPanel: String?
    var selClose: String?
}

object ModalEvents {
    const val beforeShow = "beforeShow"
    const val show = "show"
    const val shown = "shown"
    const val beforeHide = "beforeHide"
    const val hide = "hide"
    const val hidden = "hidden"
}
