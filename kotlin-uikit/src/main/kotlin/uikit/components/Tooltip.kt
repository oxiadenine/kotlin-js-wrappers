package uikit.components

import uikit.Component

external interface TooltipComponent : Component {
    fun show()
    fun hide()
}

external interface TooltipOptions {
    var title: String?
    var pos: String?
    var offset: Number?
    var animation: String?
    var duration: Number?
    var delay: Number?
    var cls: String?
    var container: String?
}

object TooltipEvents {
    const val beforeShow = "beforeshow"
    const val show = "show"
    const val shown = "shown"
    const val beforeHide = "beforehide"
    const val hide = "hide"
    const val hidden = "hidden"
}
