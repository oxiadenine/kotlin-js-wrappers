package uikit.components

import uikit.Component

external interface NavbarComponent : Component

external interface NavbarOptions {
    var align: String?
    var mode: String?
    var delayShow: Number?
    var delayHide: Number?
    var boundary: String?
    var boundaryAlign: Boolean?
    var offset: Number?
    var dropbar: Boolean?
    var dropbarMode: String?
    var duration: Number?
}

object NavbarEvents {
    const val beforeShow = "beforeshow"
    const val show = "show"
    const val shown = "shown"
    const val beforeHide = "beforehide"
    const val hide = "hide"
    const val hidden = "hidden"
}
