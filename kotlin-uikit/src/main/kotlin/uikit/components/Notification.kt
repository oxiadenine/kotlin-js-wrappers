package uikit.components

external interface Notification {
    fun closeAll(group: Any? = definedExternally, immediate: Boolean? = definedExternally)
}

external interface NotificationElement {
    fun close(immediate: Boolean = definedExternally)
}

external interface NotificationOptions {
    var message: String?
    var status: String?
    var timeout: Int?
    var group: String?
    var pos: String?
}

object NotificationEvents {
    const val close = "close"
}
