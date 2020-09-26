package uikit.components

import uikit.*

external interface SwitcherComponent : Component {
    fun show(index: Any /* String | Int | Element */ = definedExternally)
}

external interface SwitcherOptions {
    var connect: String?
    var toggle: String?
    var active: Number?
    var animation: String?
    var duration: Number?
    var swiping: Boolean?
}

object SwitcherEvents {
    const val beforeShow = "beforeshow"
    const val show = "show"
    const val shown = "shown"
    const val beforeHide = "beforehide"
    const val hide = "hide"
    const val hidden = "hidden"
}
