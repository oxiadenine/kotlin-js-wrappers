package uikit.components

import uikit.Component

external interface TabComponent : Component {
    fun show(index: Any? /* String | Number | Node */ = definedExternally)
}

external interface TabOptions {
    var connect: String?
    var toggle: String?
    var active: Number?
    var animation: String?
    var duration: Number?
    var swiping: Boolean?
    var media: Any? /* Number | String */
}

object TabEvents {
    const val beforeShow = "beforeshow"
    const val show = "show"
    const val shown = "shown"
    const val beforeHide = "beforehide"
    const val hide = "hide"
    const val hidden = "hidden"
}