package uikit.components

external interface AlertElement {
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
