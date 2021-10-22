package uikit.components

import uikit.*

external interface FilterComponent : Component

external interface FilterOptions {
    var target: String?
    var selActive: Any? /* String | Boolean */
    var animation: Any? /* String | Boolean */
    var duration: Number?
}

object FilterEvents {
    const val beforeFilter = "beforeFilter"
    const val afterFilter = "afterFilter"
}
