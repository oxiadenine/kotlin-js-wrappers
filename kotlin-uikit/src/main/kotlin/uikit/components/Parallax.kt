package uikit.components

import uikit.Component

external interface ParallaxComponent : Component

external interface ParallaxOptions {
    var easing: Number?
    var target: String?
    var start: Any? /* Number | String */
    var end: Any? /* Number | String */
    var media: Any? /* Number | String */
}
