package uikit.util

external interface EnvUtil {
    val inBrowser: Boolean
    val isIE: Boolean
    val isRtl: Boolean

    val hasTouch: Boolean

    val pointerDown: String
    val pointerMove: String
    val pointerUp: String
    val pointerEnter: String
    val pointerLeave: String
    val pointerCancel: String
}