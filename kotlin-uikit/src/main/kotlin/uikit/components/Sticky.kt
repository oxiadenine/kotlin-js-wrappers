package uikit.components

import uikit.Component

external interface StickyComponent : Component

external interface StickyOptions {
    var top: Any? /* Number | String */
    var bottom: Any? /* Boolean | String */
    var offset: String?
    var animation: String?
    var clsActive: String?
    var clsInactive: String?
    var showOnUp: Boolean?
    var media: Any? /* Number | String */
    var targetOffset: Any? /* Boolean | Number */
}

object StickyEvents {
    const val active = "active"
    const val inactive = "inactive"
}