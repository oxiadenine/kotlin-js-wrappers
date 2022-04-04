package uikit.components

import uikit.Component

external interface ImageComponent : Component

external interface ImageOptions {
    var dataSrc: String?
    var dataSrcset: String?
    var sizes: String?
    var width: String?
    var height: String?
    var offsetTop: String?
    var offsetLeft: String?
    var target: String?
}
