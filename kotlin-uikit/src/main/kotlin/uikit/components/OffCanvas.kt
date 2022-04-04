package uikit.components

import uikit.Component

external interface OffCanvasComponent : Component {
    fun show()
    fun hide()
}

external interface OffCanvasOptions {
    var mode: String?
    var flip: Boolean?
    var overlay: Boolean?
    var escClose: Boolean?
    var bgClose: Boolean?
    var container: String?
}

object OffCanvasEvents {
    const val beforeShow = "beforeshow"
    const val show = "show"
    const val shown = "shown"
    const val beforeHide = "beforehide"
    const val hide = "hide"
    const val hidden = "hidden"
}
