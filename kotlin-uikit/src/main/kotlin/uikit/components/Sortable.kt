package uikit.components

import uikit.Component

external interface SortableComponent : Component

external interface SortableOptions {
    var group: String?
    var animation: Number?
    var treshold: Number?
    var clsItem: String?
    var clsPlaceholder: String?
    var clsDrag: String?
    var clsDragState: String?
    var clsBase: String?
    var clsNoDrag: String?
    var clsEmpty: String?
    var clsCustom: String?
    var handle: String?
}

object SortableEvents {
    const val start = "start"
    const val stop = "stop"
    const val moved = "moved"
    const val added = "added"
    const val removed = "removed"
}
