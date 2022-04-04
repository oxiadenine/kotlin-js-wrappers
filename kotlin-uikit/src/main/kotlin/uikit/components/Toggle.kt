package uikit.components

import uikit.Component

external interface ToggleComponent : Component {
    fun toggle()
}

external interface ToggleOptions {
    var target: String?
    var mode: String?
    var cls: String?
    var media: Any? /* Number | String */
    var animation: String?
    var duration: Number?
    var queued: Boolean?
}

object ToggleEvents {
    const val beforeShow = "beforeshow"
    const val show = "show"
    const val shown = "shown"
    const val beforeHide = "beforehide"
    const val hide = "hide"
    const val hidden = "hidden"
}
