package uikit.components

external interface FilterElement

external interface FilterOptions {
    var target: String?
    var selActive: Any? /* String | Boolean */
}

object FilterEvents {
    const val beforeFilter = "beforeFilter"
    const val afterFilter = "afterFilter"
}
