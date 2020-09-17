package uikit.components

import org.w3c.dom.events.Event
import uikit.Component
import uikit.util.Environment

external interface UploadComponent : Component

external interface UploadOptions {
    var url: String?
    var multiple: Boolean?
    var name: String?
    var type: String?
    var params: dynamic
    var allow: String?
    var mime: String?
    var concurrent: Number?
    var method: String?
    var msgInvalidMime: String?
    var msgInvalidName: String?
    var clsDragOver: String?
    var abort: (() -> Unit)?
    var beforeAll: (() -> Unit)?
    var beforeSend: ((env: Environment) -> Unit)?
    var complete: (() -> Unit)?
    var completeAll: (() -> Unit)?
    var error: (() -> Unit)?
    var load: (() -> Unit)?
    var loadEnd: ((e: UploadEvent) -> Unit)?
    var loadStart: ((e: UploadEvent) -> Unit)?
    var progress: ((e: UploadEvent) -> Unit)?
    var fail: (() -> Unit)?
}

external class UploadEvent : Event {
    val total: Int
    val loaded: Int
}

object UploadEvents {
    const val upload = "upload"
}
