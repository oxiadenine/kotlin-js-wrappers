package uikit.components

import uikit.Component

external interface AlertComponent : Component {
    fun close()
}

external interface AlertOptions {
    var animation: Any? /* Boolean | String */
    var duration: Number?
    var selClose: String?
}

object AlertEvents {
    const val beforeHide = "beforehide"
    const val hide = "hide"
}
