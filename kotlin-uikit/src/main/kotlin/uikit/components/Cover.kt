package uikit.components

import uikit.Component

external interface CoverComponent : Component

external interface CoverOptions {
    var automute: Boolean?
    var width: Number?
    var height: Number?
}