package uikit.components

import uikit.Component

external interface ParallaxComponent : Component

external interface ParallaxOptions {
    var easing: Number?
    var target: String?
    var viewport: Number?
    var media: Any? /* Int | String */
}
