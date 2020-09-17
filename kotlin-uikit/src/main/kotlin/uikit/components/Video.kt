package uikit.components

import uikit.Component

external interface VideoComponent : Component

external interface VideoOptions {
    var autoplay: Any? /* Boolean | String */
    var automute: Boolean?
}
