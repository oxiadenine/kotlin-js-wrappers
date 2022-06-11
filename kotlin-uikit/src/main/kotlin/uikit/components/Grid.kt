package uikit.components

import uikit.Component

external interface GridComponent : Component

external interface GridOptions {
    var margin: String?
    var firstColumn: String?
    var masonry: Boolean?
    var parallax: Number?
}