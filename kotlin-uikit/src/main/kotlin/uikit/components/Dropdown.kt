package uikit.components

external interface DropdownElement {
    fun show()
    fun hide(delay: Boolean = definedExternally)
}

external interface DropdownOptions {
    var toggle: Any? /* String | Boolean */
    var pos: String?
    var mode: String?
    var delayShow: Number?
    var delayHide: Number?
    var boundary: String?
    var boundaryAlign: Boolean?
    var flip: Any? /* Boolean | String */
    var offset: Number?
    var animation: String?
    var duration: Number?
}

object DropdownEvents {
    const val toggle = "toggle"
    const val beforeShow = "beforeshow"
    const val show = "show"
    const val shown = "shown"
    const val beforeHide = "beforehide"
    const val hide = "hide"
    const val hidden = "hidden"
    const val stack = "stack"
}
