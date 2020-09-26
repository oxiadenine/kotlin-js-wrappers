package uikit.components

import uikit.*

external interface VideoComponent : Component

external interface VideoOptions {
    var autoplay: Any? /* Boolean | String */
    var automute: Boolean?
}
